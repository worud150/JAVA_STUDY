package com.green.java.jk;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("숫자입력 > ");
//        int val1 = scan.nextInt();
//
//        System.out.println("숫자입력 > ");
//        int val2 = scan.nextInt();
//
//        int min = val1, max = val2;
//        if (min > max) {
//            min = val2;
//            max = val1;
//        }
//        int sum = min;
//        System.out.print(min);
//        for (int i = min + 1; i <= max; i++) {
//            sum += i;
//            System.out.printf(", %d", i);
//        }
//        System.out.println();
//        System.out.printf("합계 : %d\n", sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자입력 > ");
        int a = scanner.nextInt();
        System.out.println("숫자입력 > ");
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;

        for (int i = min; i <= max; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
