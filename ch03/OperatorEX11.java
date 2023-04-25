package com.green.java.ch03;

public class OperatorEX11 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';

        char zero ='0';
        char two = '2';

        System.out.printf("'%c' - '%c' =%d\n", d, a, d - a);
        System.out.printf("%c - %d\n", zero,(int)zero);
        System.out.printf("%c - %d\n", two,(int)two);
        //타입이 안 맞아서 앞에 int로 강제형변환 해줌
        //캐릭터 타입도 사칙연사일 시 자동형변화함
    }
}
