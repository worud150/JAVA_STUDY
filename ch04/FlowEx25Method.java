package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25Method {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        String temp = scan.nextLine();
        int sum = sumStringNumber(temp);
        System.out.printf("각 자리수의 합 : %d\n", sum);
    }


    public static int sumStringNumber(String str) {
        int val = Integer.parseInt(str);
        int sum = 0;
        while (val > 0){
            sum += val % 10;
            val /= 10;
        } return sum;
    }

}
