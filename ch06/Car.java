package com.green.java.ch06;

public class Car {
    static String brand; //객체화 하지 않아도 메모리에 올라감
    String model; //객체화가 무조건 필요함 안하면 메모리에 안올라감
    int price;  //객체화가 무조건 필요함 안하면 메모리에 안올라감

    static void powerOn(){
        System.out.printf("%s차의 시동 걸림\n", brand); // 값을 안넣으면 null
    }
    void  printinfo(){
        System.out.printf("brand: %s, model : %s, price : %,d\n",
                model, model ,price);
    }

}
