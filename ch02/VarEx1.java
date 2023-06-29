package com.green.java.ch02;

public class VarEx1 {
    //p.21
    public static void main(String[] args) {
        int year = 0; // 변수명은 year 타입은 int 0값을 대입 (초기화)
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}
