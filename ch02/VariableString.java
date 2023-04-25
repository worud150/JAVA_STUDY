package com.green.java.ch02;

public class VariableString {
    public static void  main(String[] args) {
        //대문자로 저장되는 변수 값은 주소값이다
        //문자열을 합칠때 "+"로 합침
        String s1 = "Hello" + "재구미";
        String s2 = "World";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        System.out.println(s3);

        //띄어쓰기
        String s4 = s1 + " " + s2;
        System.out.println(s4);
    }
}
