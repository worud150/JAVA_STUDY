package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        //래퍼타입들이 있음

        int a = 10;
        Integer a2 = a;

        //generic 제네릭
        //인트형으로 받고 인트형으로 받음
        //문자열 절대 안들어감
        //실수값도 들어 갈 수 없다.
        //모든 방이 정수값만 넣을 수 있음
        ArrayList<Integer> list = new ArrayList<>();
//        list.add("11");
//        list.add(10.1);
//        list.add(true);
        list.add(10);
        list.add(13);

        int n1 = list.get(0); // 형변환 안해도 사용이 가능함
        System.out.println(list); // 문자열로 구현할 수 있게 오버라이딩 되어 있음
    }
}
