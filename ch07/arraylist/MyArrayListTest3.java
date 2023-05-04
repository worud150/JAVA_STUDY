package com.green.java.ch07.arraylist;

public class MyArrayListTest3 {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);


        list.set(1,99);

        System.out.println(list);

       boolean r1 = list.contains(60);
       System.out.println(r1);

       boolean r2 = list.contains(100);
       System.out.println(r2);

    }
}
