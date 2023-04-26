package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,100); //1번자리에 100을 넣겠다. 그래서 다 뒤로 밀림
        list.add(0,300);
        System.out.println(list);

        int removeValue = list.remove(4);// 4번방의 있는 값을 지우겠다.
        System.out.println("removeValue " + removeValue);
        System.out.println(list);
    }
}
