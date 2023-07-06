package com.green.java.ch14;

import javax.swing.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class RefMethod1 {
    public static void main(String[] args) {
        Function<String, Integer> f= s -> Integer.parseInt(s);
        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println("f.apply : " + (f.apply("10") + 2));
        System.out.println("f2.apply : " + (f2.apply("10") + 2));

        BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
        String s1 = new String("Hello");
        String s2 = new String("Hello2");
        System.out.println(f3.apply(s1,s2));

        BiFunction<String, String, Boolean> f4 = String::equals;
        System.out.println(f4.apply(s1,s2));

        Supplier<MyClass> s = () -> new MyClass();
        MyClass mc = s.get();

        Supplier<MyClass> s3 = MyClass::new;
    }
}

class MyClass {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
