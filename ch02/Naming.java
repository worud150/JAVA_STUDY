package com.green.java.ch02;

public class Naming {
    public static void main(String[] args) {


        //p.25

        //단어 +단어+단어
        //Hello World Bye

        //파스칼 케이스 기법 > 클래스명
        String HelloWorldBye;


        // 카멜 케이스 기법 > 변수명, 메소드명 제일 첫글자만 소문자
        String hello_World_Bye;

        // 스네이크 케이스 기법
        //Hello_World_Bye/html

        // 케밥 케이스 기법
        //Hello-World-Bye /css

        //자바 이름에 쓸 수 있는 특수 기호 2개 _,$
        // _hi,h$i;

        //이름 처음에 숫자 사용불가

        //이름에 빈칸 사용 불가

        //대소문자 구분
        //String aaa;
        //String AAA; 다름

        //예약어 사용 금지 (파란색상 단어는 예약어)

        //상수는 전부 대문자, 스네이크 케이스 기법
        //상수 쓰는 이유 : 속도도 빠르고 실수안하려고
        final int NUM = 13;
        System.out.println(NUM);
        //NUM = 20;



    }
}
