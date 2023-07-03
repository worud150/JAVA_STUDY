package com.green.java.ch14;


import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(11);
        myList.add(20);
        myList.add(21);
        myList.add(30);
        myList.add(31);

        System.out.println(myList);
        System.out.println("--------------------------");
//        myList.forEach(item -> System.out.println(item + " 개"));
        myList.forEach(item -> System.out.println(item * 2));
        MyArrayList mapList = myList.filter(item -> item % 2 == 0);

        System.out.println("---------------------");
        List<Integer> realList = new ArrayList<>();
        realList.add(10);
        realList.add(11);
        realList.add(20);
        realList.add(21);
        realList.add(30);
        realList.add(31);
        realList.forEach(item -> System.out.println(item));
//        realList.stream().map(item -> item % 2 == 0);
    }
}
