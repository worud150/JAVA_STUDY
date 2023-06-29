package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz7 {
    public static void main(String[] args) {
        int [] numArr = {11, 14, 2, 7, 36, 35};
        int [] copyArr = new int [numArr.length + 1];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        copyArr [copyArr.length - 1] = 100;//무조건 마지막 방번호임

        String result = Arrays.toString(copyArr);
        System.out.println(result);

//        numArr = copyArr; // jvm이 메모리가 부족하면 나중에 치워줌


//        for (int i = 0; i < copyArr.length; i++) {
//            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
//        }
    }
}
