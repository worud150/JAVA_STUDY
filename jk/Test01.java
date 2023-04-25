package com.green.java.jk;

public class Test01 {
    public static void main(String[] args) {
        int x = 10;
        int y = x-- + 5 + --x;
        System.out.println("x : " + x + ", y : " + y);

        char ch1 ='a', ch2 = 'A'; //a=97 A=65
        System.out.println("== 연산자에 의한 결과 : " + (ch1 == ch2));
        System.out.println("> 연산자에 의한 결과 : " + (ch1 > ch2));
    }
}
