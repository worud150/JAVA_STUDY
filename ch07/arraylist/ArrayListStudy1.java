package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        /*
            1. 객체화 먼저 해야함
            2. 몇개든 상관없이 추가 가능함
            3. .add를 꼭 써야함
            4. 뺄때는 get을 사용해서 빼야함
         */
        List list = new ArrayList(); //크기가 정해져 있지 않음 , 다형성 상속관계임
        list.add(10); //0번방에 값이 들어감, 값 넣는 법
        list.add(20); //1번방에 값이 들어감
        list.add("aaa"); //정수값 문자열 다 들어감
        //Object 타입으로 받아서 모든 값을 받을 수 있음

        Object obj = 10;

        System.out.println(list.get(0)); // 값 빼는 법
        System.out.println(list.get(1)); // 값 빼는 법
        System.out.println(list.get(2)); // 값 빼는 법

        int n1 = (int)list.get(0); // 무조건 형변환 해야함
        int n2 = (int)list.get(1);
        String str1 = (String)list.get(2);

    }
}
