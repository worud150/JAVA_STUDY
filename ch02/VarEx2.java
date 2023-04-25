package com.green.java.ch02;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20, temp = 0;

        System.out.printf("x: %d, y: %d\n", x, y);

        temp = x;
        x = y;
        y = temp;

        System.out.printf("x: %d, y: %d\n", x, y);


//        System.out.printf("x: %d, y: %d\n", y, x);
        // 본체 원래 형질이 변하는게 아니라 그냥 보이는 위치만 바뀐거라 의미가 없음
    }
}
