package com.green.java.ch02;

import java.util.Arrays;

public class StringStudy2 {
    public static void main(String[] args) {
        String str = "        안녕하세요.**저는 김재경**입니다.      ";

        String r1 = str.replace("*"," ").trim();
        System.out.println(r1);

        String r2 = str.trim();
        System.out.println(r2);

        String str2 = "A:B:C:D:E";
        String[] strArr = str2.split(":");
        System.out.println(Arrays.toString(strArr));
        System.out.println(str2);

        String str3 = "AbCdEfG";
        String r3 = str3.toLowerCase();
        System.out.println(r3);

        String r4 = str3.toUpperCase();
        System.out.println(r4);
    }
}
