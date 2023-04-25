package com.green.java.jk;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.println("성별 m, w");
        String gender = scan.nextLine();

        System.out.println("키 입력 (cm)");
        int height = scan.nextInt();

//        int stand = 0;
//
//        if (gender.equals("w")) {
//            stand = WOMAN_HEIGHT_STAND;
//        } else if (gender.equals("m")) {
//            stand = MAN_HEIGHT_STAND;
//        }
//
//        if (height > stand) {
//            System.out.println("평균초과");
//        } else if (height < stand) {
//            System.out.println("평균미만");
//        } else {
//            System.out.println("평균");
//        }

        int stand2 = 0;

        if (gender.equals("w")) {
            stand2 = WOMAN_HEIGHT_STAND;
        }else if (gender.equals("m")){
            stand2 = MAN_HEIGHT_STAND;
        }
        if (height > stand2) {
            System.out.println("평균초과");
        } else if (height < stand2) {
            System.out.println("평균미만");
        }else  {
            System.out.println("평균");
        }

    }
}


