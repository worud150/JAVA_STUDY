package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열 : 같은 타입의 여러값을 저장하기 위한 공간
        //변수는 무조건 하나만 저장 됨 무조건 무조건 무조건 무조건
        //배열은 여러값을 한번에 관리
        //배열의 친구는 for문이다. _ 반복문

        // 초기화 값
        int [] numArr = {10, 20, 30}; //int형 배열이다.
        numArr [0] = 11;
        int num = numArr[0];
        System.out.println(num);
    }
}
