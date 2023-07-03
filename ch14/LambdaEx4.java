package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(item -> System.out.print( item + "," ));
        System.out.println();
        System.out.println("--------------------");

        list.removeIf(item -> item % 2 == 0 || item % 3 == 0); // 원본에서 짝수만 제거하고싶음
        list.forEach(item -> System.out.print( item + "," ));
        System.out.println();

        System.out.println("------------");
        list.replaceAll(item -> item * 10);
        list.forEach(item -> System.out.print(item + ","));
        System.out.println();
    }
}
