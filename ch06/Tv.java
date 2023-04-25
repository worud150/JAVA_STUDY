package com.green.java.ch06;

import java.util.Stack;

public class Tv {
    //실체가 아님 메모리에 올라가지 않음 (설계함)
    //인스턴스 멤버필드
    String color;
    boolean power;
    int channel;

    //클래스 멤버필드
     static String brand;

    //static이 붙고 싶으면 같이 멤버필드에 static을 붙여여함
    //유일하게 static을 붙이는 경우
    //외부에서 값을 가져왔을 경우
    void power() {power = !power;}
    void channelUp(){++channel;}
    void channelDown () {--channel;}

    static String  getbrand() {
        return brand;
    }
}
