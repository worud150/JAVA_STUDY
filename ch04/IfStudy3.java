package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3 {
    public static void main(String[] args) {
        //m, 171 > 초고
        //m, 172 초과값 > 평균초과
        //m, 170 이하값 > 평균 미만

        //w, 158 > 초고
        //w, 158 초과값 > 평균초과
        //w, 158 이하값 > 평균 미만

        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.println("성별 입력 (w, m)");
        String gender = scan.nextLine();

        System.out.println("키 입력 (cm)");
        int height = scan.nextInt();


//         초보자들이 이렇게 짬
//       if (gender.equals("w")) {
//           if (height == WOMAN_HEIGHT_STAND ) {
//               System.out.println("평균");
//           } else if (height > WOMAN_HEIGHT_STAND) {
//               System.out.println("초과");
//           } else if (height < WOMAN_HEIGHT_STAND) {
//               System.out.println("미만");
//           }
//        }
//           else if (gender.equals("m")) {
//               if (height == MAN_HEIGHT_STAND ) {
//                   System.out.println("평균");
//               } else if (height > MAN_HEIGHT_STAND) {
//                   System.out.println("초과");
//               } else if (height < MAN_HEIGHT_STAND) {
//                   System.out.println("미만");
//               }
//           }



        int stand = 0;

         if (gender.equals("w")) {
             stand = WOMAN_HEIGHT_STAND;
         } else if (gender.equals("m")) {
             stand = MAN_HEIGHT_STAND;
         }

         if (height > stand) {
             System.out.println("평균초과");
         } else if (height< stand) {
             System.out.println("평균미만");
         } else  {
             System.out.println("평균");
         }

       }

}
