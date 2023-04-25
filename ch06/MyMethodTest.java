package com.green.java.ch06;

import java.io.PrintStream;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.sum(10,20);

        int result = mm.sum2(10,245);
        System.out.println(result);

        PrintStream ps = System.out; //PrintStream 객체 주소값만 저장할 수 있다. //컴파일러가 해줌.
        ps.print(result);
    }
}
