package com.green.java.ch05;

public class ArryQuiz4 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        //전체 합계값
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println("sum: " + sum);
    }
}
