package com.green.java.ch05;

public class ArrayQuiz11 {
    public static void main(String[] args) {
//        int[] numArr = {11, 14, 7, 2, 36, 35};
//        int sum = 0;
//
//        for (int i = 0; i < numArr.length; i++) {
//            sum += numArr[i]; // 계산을 끝낸것은 유지하는것이 좋다.
//        }
//        double avg = (double) sum / numArr.length;
//        System.out.println("avg: " + avg);

        int[] numArr = {11, 14, 7, 2, 36, 35};
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i]; // 계산을 끝낸것은 유지하는것이 좋다.
        }
        double avg = (double) sum / numArr.length;
        System.out.printf("avg: %,d", avg);

    }
}
