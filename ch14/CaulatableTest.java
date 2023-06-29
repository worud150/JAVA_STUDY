package com.green.java.ch14;

public class CaulatableTest {
    public static void main(String[] args) {

        Calculatable cc = new Calculatable() {
            @Override
            public int calc(int n1, int n2) {
                return n1 + n2;
            }
        };
        int result = cc.calc(10,20);
        System.out.println("result : " + result);

        System.out.println("----------------------------------");

        // 중 괄호가 없으면 한 줄로 정의한다. (세미콜론이 한줄이다)
        // 소괄호가 생략이 가능한 경우 파라미터값이 한개일때 생략이 가능하다
        // 파라미터값이 없거나 2개 이상일때는 꼭 소괄호를 넣어줘야한다.
        Calculatable c1 = (n1, n2) -> n1 + n2; //  이게 람다식으로 작성한 것
        int result2 = c1.calc(50,50);
        System.out.println("result2 : " + result2);

        System.out.println("----------------------------------");

        Calculatable cc1 = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println("result3 : " + cc1.calc(11,22));
    }
}
