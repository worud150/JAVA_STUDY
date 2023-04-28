package com.green.java.ch02;

public class StringStudy1 {
    public static void main(String[] args) {
        String str = "abcdefghijkimn";

        String s1 = str.substring(0,2);
        System.out.println(s1);

        String s2 = str.substring(3,6);
        System.out.println(s2);

        String s3 = str.substring(3);
        System.out.println(s3);

        int idx = str.indexOf("g");
        System.out.println("idx : " + idx);

        int len = str.length();
        System.out.println(len);
    }
}
