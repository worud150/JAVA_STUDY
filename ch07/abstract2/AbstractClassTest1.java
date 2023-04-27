package com.green.java.ch07.abstract2;

public abstract class AbstractClassTest1 {
    public static void main(String[] args) {
        AbstractClassStudy1 acs1 = new ChildClass();
        acs1.sum(10, 20);

        int x = acs1.multi(10,11);
        System.out.println(x);

        AbstractClassStudy1 acs2 = new ChildClass2();
        acs2.sum(10, 20);
    }
}
