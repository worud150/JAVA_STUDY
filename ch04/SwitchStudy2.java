package com.green.java.ch04;

import java.util.Scanner;

public class SwitchStudy2 {
    public static void main(String[] args) {


        // 100-90 %d점의 학점은 A입니다.
        // 80-89 %d점의 학점은 B입니다.
        // 70-79 %d점의 학점은 C입니다.
        // 나머지 %d점의 학점은 D입니다.

        Scanner scan = new Scanner(System.in);
        System.out.println("점수입력 : ");
        int score = scan.nextInt();

        String grade = "D";

        switch (score/10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            default:
                grade = "D";
                break;
        }
        System.out.printf("%d점의 학점은 %s입니다.", score, grade);

    }
}
