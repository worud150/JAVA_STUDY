package com.green.java.ch05;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] temp = { // temp의 자식은 4개 그 손자는 3,3,3,3개임
                {0,0,0},
                {0,0,0},
                {0,0,0},
                {0,0,0},
        };
        System.out.printf("temp.length: %d\n",temp.length);
        System.out.printf("temp[0].length: %d\n",temp[0].length);
        System.out.printf("temp[1].length: %d\n",temp[1].length);
        System.out.printf("temp[2].length: %d\n",temp[2].length);

        System.out.printf("temp[0][0] > %d\n", temp[0][0]);

        int[] arr0 = temp[0];
        arr0 [0] = 30;

        int [][] score = new int[4][3];
        System.out.println(score[0][0]);
        score [2][1] = 10; // 각방에 접근하는 방법

        System.out.println(score.length); //행 값
        System.out.println(score[0].length); // 열값


    }
}
