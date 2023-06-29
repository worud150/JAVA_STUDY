package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz2 {
    public static void main(String[] args) {
        //1~45사이의 랜덤값

        int [] rNumArr = new int[6];


         for (int i = 0; i < rNumArr.length; i++) {
             rNumArr [i] = (int)(Math.random() * 45) + 1;
        }
        System.out.println(Arrays.toString(rNumArr));//이런식으로 직접적으로 작성이 가능함

        for (int i = 0; i < rNumArr.length; i++ ) {
            System.out.println(rNumArr[i]);
        }
    }
}
