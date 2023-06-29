package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx4Method {
    public static void main(String[] args) {

        int score = 0, score1;
        char grade = 'D', grade1;

        ScoreObj so = new ScoreObj();
        grade = so.getGrade(score);

        System.out.println("점수를 입력하세요");

        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();


        System.out.printf("%d점의 학점은 %c입니다.", score, grade);

    }
}
class ScoreObj {
    char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        }else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        return 'D';
    }
}


