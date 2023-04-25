package com.green.java.ch03;

public class OperatorEX21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
        System.out.printf("'0' == 0\t %b\n", '0' == 0);
        System.out.printf("'A' == 65 \t %b\n", 'A' == 65);
        System.out.printf("'A' == 'B' \t %b\n", 'A' == 'B');
        System.out.printf("'A' + 1 == 'B' \t %b\n", 'A' + 1 == 'B');
        System.out.printf("'A' + 1 != 'C' \t %b\n", 'A' + 1 != 'C');
        // ! > 같지 않지? 라고 내가 먼저 말해서 웅 니말이 맞아 하고 true이 뜸

        int a = 'A';
        char b = 65;
        // * 실무때 이런경우 없음 char를 자주 쓰지 않음.
    }
}
