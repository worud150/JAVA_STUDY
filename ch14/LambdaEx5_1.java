package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5_1 {
    public static void main(String[] args) {
        // 값을 넣어줌
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1; // 1 ~ 100
        // 값을 반환함
        Consumer<Integer> c = i -> System.out.print(i + ", ");

        // 참 거짓만 반환함
        Predicate<Integer> p = i -> i % 2 == 0;
        // 어떤 정수 혹은 더블 타입을 받아도 정수로 반환
        Function<Integer, Integer> f = i -> i / 10 * 10;
        System.out.println(f.apply(10));

        List<Integer> list = new ArrayList<>();
       makeRandomList(s, list); // 10개의 랜덤한 값(1 ~ 100)을 list에 추가 해주는 메소드
        System.out.println(list);
        System.out.println("------------------------");
        printEvenNum(p, c, list);
        System.out.println();

        System.out.println("------------------------");
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);

        System.out.println("------------------------");
        List<Integer> newList2 = doSomething2(f, list);
        System.out.println(newList2);
    }
    public static void makeRandomList(Supplier<Integer>num,List<Integer> list ) {
        for (int i = 0; i <= 10; i++) {
            list.add(num.get());
        }
    }
    public static void printEvenNum(Predicate<Integer> p, Consumer<Integer> c,
                                    List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (p.test(list.get(i))) {
                c.accept(list.get(i));
            }
        }
    }
    public static List<Integer> doSomething (Function<Integer, Integer> f,
                                             List<Integer> list) {
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
           temp.add(f.apply(list.get(i)));
        }
        return temp;
    }
    public static <T>List<T> doSomething2 (Function<T, T> f, List<T> list) {
        return list.stream().map(f).toList();
    }
}
