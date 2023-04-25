package com.green.java.ch06;

public class TvTest3 {
    public static void main(String[] args) {

        Tv[] tvArr = new Tv[3];
        String[] strArr = new String[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = 10 + i;
            System.out.println(tvArr[i].channel);
        }
    }
}
