package com.green.java.ch14;

public class LambdaInterTest {
    public static void main(String[] args) {
        LambdaInterface li1 = heal -> System.out.println("에너지 : " + heal);

        li1.healing(1000);
    }
}
