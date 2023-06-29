package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1,50); // 변경

        System.out.println(list.contains(10)); // 내가 원하는 값 찾기
        System.out.println(list);
    }
}
