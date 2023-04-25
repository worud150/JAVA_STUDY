package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        boolean flag = true; // while 조건식으로 사용하세요.
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요 (끝내려면 0)");

        while (true) {
            System.out.print(">>");
            String temp = scan.nextLine();
            num = Integer.parseInt(temp);

            if ( num == 0){ // -1을해도 답이 나와서 내가 원래 적은 num > 0 은 옳지 않음
                break;
            }
          sum += num ;
        }
        System.out.println("합계 : " + sum);


//        int sum = 0;
//        System.out.println("3의 배수");
//
//        for (int i = 0; i = 100; i++) {
//            if (i)
//        }




//        int a = 0;
//        int i = 0;
//
//        while ((a += ++i) <= 100) {
//            System.out.printf("%d - %d\n", i, a);
//        }
    }
}
