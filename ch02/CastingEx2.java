package com.green.java.ch02;

public class CastingEx2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 =3;
        double a1 = n1;
        double b2 = n2;

        double d = a1 / b2;

        System.out.printf("d=%.5f\n",d);
        //10을 3으로 나눠서 소수점이 나타나도록 해주세요.
        //3.0이 나오지 않도록 해주세요.



        int n3 = 10;
        int n4 = 3;

        System.out.printf("%f\n", (double) n3 / (double) n4);

        int n5 = 10;
        int n6 = 3;

        double r = (double)n5 / n6;

        System.out.println(r);

    }
}
