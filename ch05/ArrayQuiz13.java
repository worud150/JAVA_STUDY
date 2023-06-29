package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];

        setRandomValuArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));

        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));

    }

    static int getRandomValueFromTo(int sVal, int eVal) {
        return (int) (Math.random() * (eVal - sVal + 1)) + sVal;
    }

    static void setRandomValuArr(int[] lottoArr) {
        Loop:
        // for문 해결
        for (int i = 0; i < lottoArr.length; i++) {
            int rVal = getRandomValueFromTo(1, 45);
            for (int z = 0; z < i; z++) {
                if (rVal == lottoArr[z]) {
                    i--;
                    continue Loop;
                }
            }
            lottoArr[i] = rVal;
        }
    }

    static void sortArr(int[] lottoArr) {
        for (int i = lottoArr.length - 1; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                if (lottoArr[z] > lottoArr [z + 1]) {
                    int temp = lottoArr[z];
                    lottoArr[z] = lottoArr[z + 1];
                    lottoArr[z + 1] = temp;
                }
            }
        }
    }
}
