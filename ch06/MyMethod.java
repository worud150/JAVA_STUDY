package com.green.java.ch06;

public class MyMethod {

    //void > return 타입 (void) 나 아무것도 리턴안해 흥
    //sum > 메소드명
    //(int n1, int n2) > parameter,파라미터,매개변수 / 외부에서 값을 받는거 출입구
    //void는 외롭게 무조건 외롭게 호출해야함
    void sum (int n1, int n2){ //선언부 (구현부)
        System.out.println(n1 + n2);
    }

    //return 키워드가 필수
    int sum2(int n1, int n2){
        return n1 + n2;
    }
}
