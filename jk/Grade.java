package com.green.java.jk;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int avg = 0;
        int arr = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("정수를입력하세요 : ");
        while (true) {
            num = scan.nextInt();
            if (num == 0) {break;}
            sum += num;
            arr++;
        }
         avg = sum / arr;
        System.out.printf("합계는 %d입니다. 평균은 %d입니다.",sum,avg);
    }
}
