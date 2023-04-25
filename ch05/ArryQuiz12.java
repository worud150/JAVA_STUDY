package com.green.java.ch05;

import java.util.Arrays;

public class ArryQuiz12 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 7, 2, 36, 35};

        System.out.println(Arrays.toString(numArr));


        for (int i = 0; i < numArr.length; i++) {
            int n = (int)(Math.random() * numArr.length);
            if ( i == n ) {continue;}
            int temp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
