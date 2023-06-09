package com.green.java.ch07;

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println(p.x);
        System.out.println(c.x);
    }
}

class Parent2 {
    int x = 100;
    void method () {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;
    void method() {
        System.out.println("Child Method");
    }
}
