package com.green.java.ch07.Poly;

public class Poly {
    /*
        1. 부모타입은 자식 객체 주소값 저장할 수 있다.
        2. 자식타입은 부모 객체 주소값 저장할 수 없다.
        3. 타입은 (알고있는 메소드만 호출할 수 있음)
                 (메소드를 호출할 수 있나 없나만 결정)
                  >> 실제 실행되는 건 객체 기준이다.
     */
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값 저장할 수 있다.
        Animal ani1 = new Dog(); // 상속 관계가 아니면 타입이 다를 수 없다.
        ani1.crying();
//        ani1.jump();


        //2. 자식타입은 부모 객체 주소값 저장할 수 없다.
//        Dog dog1 = new Animal();
//        Bulldog bulldog1 = (Bulldog) ani1;
        Dog dog1 = (Dog)ani1;// 강제형변환을 하지 않는이상 되지 않음.
        dog1.crying();
        dog1.jump();

//        3. 타입은 메소드를 호출할 수 있나 없나만 결정 > 실제 실행되는 건 객체 기준이다.
    }
}


