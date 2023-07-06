package com.green.java.ch14;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        // Wrapper Type
        // int > Integer
        // short > Short
        // long > Long
        // double > Double
        //float > Float

        Integer n1 = 10;
        int n2 = n1;
        Integer n3 = 10;
        // 래퍼런스 비교는 주소값이 같은지 비교함

        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 2;

        // 값만 주겠다
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

        System.out.println("--------------------------");
        Consumer<Integer> c = i -> System.out.println(i);
        Consumer<Integer> c1 = System.out::println;
        c.accept(100);
        c1.accept(456);

        int val = 9;
        Predicate<Integer> p1 = i -> i > 10;
        System.out.printf("%d > 10 : %b\n", val,p1.test(val) );

        Function<Double, Integer> fn1 = i -> i.intValue();
        System.out.printf("%d", fn1.apply(10.5));
    }
}
