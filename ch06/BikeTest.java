package com.green.java.ch06;

public class BikeTest {
    public static void main(String[] args) {

        Bike b1 = new Bike();//Bike() => 생성자 호출한거임
        b1.brand = "혼다";

        Bike b2 = new Bike("야마하");


        b1 = b2;
        System.out.println("b1.brand : " + b1.brand);
        System.out.println("b2.brand : " + b2.brand);
    }
}
