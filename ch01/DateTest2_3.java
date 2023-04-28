package com.green.java.ch01;

public class DateTest2_3 {
    public static void main(String[] args) {
        int y = 2023, m = 5, d = 17;

        System.out.printf("%s-%s-%s",y, twoNum(m),twoNum(d));
    }
    public static String twoNum (int n) {
        return (n < 10 ? "0" : "") + n;
    }
}
