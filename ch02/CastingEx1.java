package com.green.java.ch02;

public class CastingEx1 {
    public static void main(String [] args) {
        double d = 85.4;
        int score = (int)d;
        //int는 절대 소수값을 없을 수 없음 정수값만 얻음
        //뒤에 소수 점 날림

        System.out.println("score=" + score);
        System.out.println("d=" + d);

    }
}
