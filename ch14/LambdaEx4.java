package com.green.java.ch14;

import java.util.*;
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

        // arraylist는 순서가 있다 - list.add(27);
        // 하지만 map은 키와 value값이 있다 map.put("age","27")
        Map<String , Object> map = new HashMap<>();
        map.put("age", 27);
        map.put("name", "홍길동");
        map.put("height", 177.7);

        int age = (int)map.get("age");
        String  name = (String)map.get("name");
        double height = (double)map.get("height");

        // * 한 곳에 담는 이유 : 한번의 일을 하기 위해
        System.out.println("--- 담고 뺴고가 가능하다 ---");
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);

        map.forEach((key,value)-> {
            System.out.printf("%s: %s\n", key, value);
        });

    }
}
