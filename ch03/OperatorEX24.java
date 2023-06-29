package com.green.java.ch03;

public class OperatorEX24 {
    public static void main(String[] args) {
        // 정말 자주 쓰임
        //&& and 연산자 - 전부 다 true가 되어야 true가 됨
        // || or 연산자 - 전부 다 false 가 되어야 false
        //(2 > 1) && (3 > 2)
        //(2 > 1) && (3 > 2) && (3 >= 5) -- false

        //(2 > 1) || (3 > 2) || (3 >= 5) -- false

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);


        boolean r3 = (2 > 1) || (3 > 2) || (3 >= 5);
        System.out.printf("r3 : %b\n", r3);

        /********TIP********/

        // and 연산자는 거짓이 될 확률이 높은 아이를 앞 쪽에 뒤는게 좋음_실제로 연산 안하고 앞에서 이미 fales
        // or 연산자는 true 연산자를 앞쪽으로 배치하는게 좋음
    }
}

