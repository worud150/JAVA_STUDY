package com.green.java.ch07.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);


        myList.add(1, 100);
        myList.add(8, 800);
        System.out.println(myList);
//        myList.print();
    }
}
