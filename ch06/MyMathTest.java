package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        MyMathInstance m1 = new MyMathInstance();

        int n1 = 10, n2= 22;
        int result = m1.sum(n1,n2);
        System.out.println(result);

        System.out.println(MyMathStatic.sum(n1,n2));
        //()가 있으면 메소드 호출한거임
    }
}
