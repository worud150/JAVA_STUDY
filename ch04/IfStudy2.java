package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수입력 : ");
        int score = scan.nextInt();
        char c1 = 'D';
        if (score > 100 || score < 0) {
            System.out.println("점수는 0점에서 100점 사이 입니다.");
        }else if (score >= 90){
            c1 = 'A';
        }else if (score >= 80) {
            c1 = 'B';
        }else if (score >= 70) {
            c1 = 'C';
        }
        System.out.printf("%d점수는 %c학점입니다.", score, c1);
    }
}
//        Scanner scan = new Scanner(System.in);
//        System.out.println("점수입력 : " );
//        int score = scan.nextInt();
//
//        if(score > 100 || score < 0 ) {
//            System.out.println("점수는 0~100점 사이입니다.");
//        } else if (score >= 90) {
//            System.out.println("A");
//        }else if (score >= 80) {
//            System.out.println("B");
//        }else if (score >= 70) {
//            System.out.println("C");
//        }else {
//            System.out.println("D");
//        }