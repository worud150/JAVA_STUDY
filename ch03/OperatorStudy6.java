package com.green.java.ch03;

public class OperatorStudy6 {
    public static void main(String[] args) {
        int n1, n2, val = 10;

        n1 = n2 = val;
        //맨뒤부터 계산시작함 순서가 vla = n2 = n1 값으로 됨
        //실행순서와 매커니즘에 대해 이해 하기

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(val);

        int x, y, u = 20;

        x = u ;
        System.out.println(x);
    }
}
