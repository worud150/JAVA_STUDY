package com.green.java.ch02;

public class PrintfEx2 {

    public static void main(String[] args) {
        String url = "http://worud150.dothome.co.kr/";
        float f1 = .10f;
        double d = 1.2345678;

        System.out.printf("f1=%f, 지수표현했음 = %e, %g%n", f1, f1, f1);
        System.out.printf("d=%f\n", d);
        //최대한 가까운값이지 정확한 값은 아니라 7이빠짐
        System.out.printf("d=%14.10f\n", d);
        //14자리 중 소수점 10개만 쓴다 표시해야하니깐 뒤 에 000이 붙음

        System.out.printf("d=%.3f\n", d);
        //갯수상관없이 소수점 3개 쓰겠다.

        System.out.println("[12345678901234567890]");
        System.out.printf("[%s]\n", url);
        System.out.printf("[%30s]\n", url);
        System.out.printf("[%-30s]\n", url);
        System.out.printf("[%.8s]\n", url);
    }
}
