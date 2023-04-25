package com.green.java.ch05;

import java.util.Arrays;

public class ArryQuiz18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
        };

        int sum = 0;


        for (int i = 0; i < score.length; i++) { //네번 돌거임
            for (int j = 0; j < score[i].length; j++) { //네번안에 들어있는 0번째방 길이 그래서 score의 i행0번의 길이 그럼 길이가 3개라는거임
                System.out.printf("score[%d][%d] = %d \n", i, j, score[i][j]);
            }
        }

        //포이치문 사용
        for (int [] temp : score) {
            for (int i : temp){
                sum += i;
            }
        }

//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < score[i].length; j++) {
//                sum += score[i][j];
//            }
//        }
        System.out.println("sum=" + sum);
    }
}
