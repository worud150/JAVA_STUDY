package com.green.java.ch04;

import java.util.Scanner;

class ScoreObj2 {
    String getGrade(int score) {

        String grade = "D";

        if (score > 100 || score < 0) {
            return ("점수는 0~100점 사이입니다.");
        } else {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            }
            if (!grade.equals("D")) {
                if (score % 10 >= 8 || score == 100) {
                    grade += "+";
                } else if (score % 10 < 4) {
                    grade += "-";
                } else {
                    grade += "0";
                }
            }
        }
        return String.format("%d점의학점은 %s입니다. \n",score,grade);
    }
}

public class FlowEx5Method {
    public static void main(String[] args) {

        int score = 0;

        System.out.println("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreObj2 so = new ScoreObj2();

        String result = so.getGrade(score);
        System.out.println(result);

    }
}
