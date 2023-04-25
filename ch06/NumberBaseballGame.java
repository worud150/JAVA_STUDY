package com.green.java.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static int getRandomNumber2(int min, int max) {
        return (int)(Math.random() * (max  - min)) + min;
    }

    static int[] getRandomNumberArr(int numberCount) {
        int[] arr = new int[numberCount];
        int selectedidx = 0;

        Loop:
        while (selectedidx < arr.length) {
            int rVal = getRandomNumber2(1, 9);

            for (int i = 0; i < selectedidx; i++) {
                if (arr[i] == rVal) {
                    continue Loop;
                }
            }//중복된 값이 있는지 확인하는 곳
            arr[selectedidx++] = rVal;
        }
        return arr;
    }

    public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumberArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int [] myArr = new int[NUMBER_COUNT];

        while (true){
            count++;
            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력", i + 1);
                myArr[i] = scan.nextInt();
            }

            int s = 0, b = 0, o = 0;

            for (int i = 0; i < NUMBER_COUNT ; i++) {
                for (int z = 0; z < NUMBER_COUNT; z++) {
                    if (numArr[i] == myArr[z]){
                        if (i == z){
                            s++;
                        }else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S : %d, B : %d, O : %d\n",s ,b ,o);
            if (s == NUMBER_COUNT){
                break;
            }
        }
        System.out.printf("[Game Over] count : %d", count);
    }
}
