package com.green.java.ch03;

public class OperatorEX16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortsPi = (int)(pi * 1_000) / 1_000f;
        System.out.println(pi);
        System.out.println(shortsPi);
    }
}
