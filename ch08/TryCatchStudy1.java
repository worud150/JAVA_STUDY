package com.green.java.ch08;

public class TryCatchStudy1 {
    public static void main(String[] args) {
//        int r1 = 10 / 0; // => 0이되면 프로그램이 멈춘다
        try {
            //예외가 발생될  가능성이 있는 로직(source) 위치

        }catch (Exception i) {
            //예외가 발생되었을 때 하고 싶은 작업 위치
        }finally {
            //옵션, 예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치 "실행보장"
        }



        try {
            int r1 = 10 / 0; //예외가 발생되는 순간 catch e에게 감
            System.out.println("다음 줄");
        }catch (Exception e) {
            e.printStackTrace();//어떤 내용의 에러인지 알려주는 메소드
            System.out.println("예외발생");
        }finally {
            System.out.println("finally");
        }

        System.out.println("끝!");
    }
}
