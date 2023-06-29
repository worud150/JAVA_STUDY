package com.green.java.jk;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {




        int score = 0;
        char grade = 'D', opt = '0';
        System.out.println("점수를 입력해 주세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        //"%d점의학점은 %c%c입니다.
        if (score >= 90) {
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'c';
        } else {
            opt = ' ';
        }
        if (grade != 'D') {
            if (score % 10 >= 8 || score == 100) {
                opt = '+';
            }else if (score % 10 > 4) {
                opt = '-';
            }
        }
        System.out.printf("%d의 학점은 %c%c입니다.",score, grade,opt);
    }
}
