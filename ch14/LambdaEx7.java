package com.green.java.ch14;

import java.util.function.*;

public class LambdaEx7 {
    public static void main(String[] args) {

        // 앞에있는게 파라미터 타입, 뒤에있는것이 리턴타입이다.
        Function<String, Integer> f = s -> Integer.parseInt(s,16);
        Function<Integer, String> g = i -> Integer.toBinaryString(i);

        System.out.println(f.apply("A")); // 16진법
        System.out.println(g.apply(9)); // 2진수

        Function<String, String> h = f.andThen(g);

        System.out.println("h :" + h.apply("A"));

        Function<String, String> f2 = x -> x; // 항등함수
        System.out.println(f2.apply("AAA"));

        System.out.println("--------------------------------------");

        Predicate<Integer> p = i -> i < 100;
        System.out.println(p.test(99));

        Predicate<Integer> q = i -> i < 200;
        System.out.println(q.test(200));

        Predicate<Integer> r3 = i -> i % 2 == 0;
        System.out.println(r3.test(100));

        Predicate<Integer> notP = p.negate();
        System.out.println("p : "+p.test(99));
        System.out.println("notP : "+notP.test(99));

        Predicate<Integer> all = notP.and(q.or(r3));
        System.out.println("all.test(222) : " + all.test(222));
        System.out.println("all.test(199) : " + all.test(199));
        System.out.println("all.test(201) : " + all.test(201));

        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);
        System.out.println(p2.test(str2));
        System.out.println(str1 == str2);
    }

}