package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        //리터럴 Literal 값 그자체!
        byte b1 = 127;
        System.out.println(b1);

        //overflow 현상이 일어나면 안 좋은 현상 문제가 있음
        int i1 = 129;
        int i2 = b1 ; // 자동형변환
        System.out.println(i2);
        b1 = (byte)i1; //강제형변환
        System.out.println(b1);



        b1 = (byte)-129;
        System.out.println(b1);
    }
}
