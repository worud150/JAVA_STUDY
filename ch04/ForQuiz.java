package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz {
    public static void main(String[] args) {
        //내가한거
//        int gugudan = 3;
//        for ( int i = 1; i <= 9; i++) {
//            for (int j = 1; j < gugudan; j++) {
//                System.out.printf("%d x %d = %d\n",gugudan, i, i*gugudan);
//            }
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("출력하고싶은 구구단");
//        int gugudan = scan.nextInt();
//        for (int i = 1; i<=9; i++){
//            System.out.printf("%d x %d = %d\n", gugudan, i, (gugudan*i));
//        }


        Scanner scan = new Scanner(System.in);
        System.out.println("출력하고 싶은 구구단을 작성하세요>");
        int num = scan.nextInt();

        for (int i = 1; i<=9; i++){
            System.out.printf("%d X %d = %d\n", num, i, (num*i));
        }
    }

}
