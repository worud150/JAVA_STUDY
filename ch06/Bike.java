package com.green.java.ch06;

public class Bike {
    String brand;
    String model;
    int price;

    //기본생성자 => 파라미터가 하나도 없는
    // 최초 딱 한번 메소드의 종류임
    // 메소드 구분법 리턴값없음 클래스명 동일해야 함
//    public Bike() {
//        System.out.println("Bike 생성자");
//    }
//    public Bike() {}
    public Bike() {

    }
    public Bike(String brand) {
        this.brand = brand; // 나 자신의 주소값을 들고 있음 this
    }

    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike(Bike bike) {

        this.brand = bike.brand;
        this.model = bike.model;
        this.price = bike.price;
    }

    void drive (){
        System.out.printf("%s 브랜드 %s 모델이 달린다.", brand, model);
    }

}
