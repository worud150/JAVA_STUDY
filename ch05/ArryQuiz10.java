package com.green.java.ch05;

import java.util.Arrays;

public class ArryQuiz10 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 7, 2, 36, 35};
        int min = numArr[0];

        for (int i = 0; i < numArr.length; i++) {
            if (min > numArr[i]){
                min = numArr[i];
            }
        }
        System.out.println("min: " + min);

    }
}
