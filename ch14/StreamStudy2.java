package com.green.java.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamStudy2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5, 3, 20, 10, 100, 200, 300); // = int[] intArr = {1, 2, 3, 4, 5}
        List<Integer> resultList = intList.stream()
                                        .distinct() // 중복제거
                                        .skip(2) // 2개 넘기고 출력
                                        .limit(3) // 내가 갖고싶은 갯수
                                        .toList();
        System.out.println(intList);
        System.out.println(resultList);

        System.out.println("------------------------------");
        IntStream.range(1, 5).forEach(System.out::println);
        System.out.println("---------------");
        IntStream.rangeClosed(1, 5).forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);

        List<Integer> list3 = Arrays.stream(IntStream.rangeClosed(1, 100).toArray())
                                    .boxed()
                                    .collect(Collectors.toList());
        List<Integer> list4 = IntStream.rangeClosed(1,100).boxed().toList();
        System.out.println(list4);
    }
}
