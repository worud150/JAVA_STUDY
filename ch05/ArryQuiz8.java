package com.green.java.ch05;

import java.util.Arrays;

public class ArryQuiz8 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        System.out.print('[');

        for (int i = 0; i < numArr.length; i++) {

            if (i >= 1) {
                System.out.print(", ");
            }
            System.out.print(numArr[i]);
        }

        System.out.println("]");

        System.out.println("---------------------");

        System.out.printf("[%d", numArr[0]); //다율언니가 했던것

        for (int i = 1; i < numArr.length; i++) {
            System.out.printf(", %d",numArr[i]);
        }
        System.out.println("]");
    }
}
