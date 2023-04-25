package com.green.java.ch03;

public class OperatorStudy1 {
    public static void main(String[] args) {
        int num = 5;

        //곱하기
        int result = 4 + num * 3;
        System.out.println(result);

        //나누기
        result = 11 / num;
        System.out.println(result);

        //빼기
        result = result - 1;
        System.out.println(result);

        //나머지값 13/5 하면 나머지값 나옴 그 값을 나타낼때 홀짝 수 인지 맞춤/모드라고 읽음
        result = 13 % num;
        System.out.println("나머지값이 이제 이 숫자임 :" + result);
    }
}
