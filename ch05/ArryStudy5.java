package com.green.java.ch05;

public class ArryStudy5 {
    public static void main(String[] args) {

        int[] numArr = new int[]{10, 20, 30, 40, 50};
        int [] copyArr = new int[numArr.length];//주소값만 복사함
        System.out.println(copyArr[2]);

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }
    }
}
