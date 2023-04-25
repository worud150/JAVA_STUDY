package com.green.java.ch02;

public class Variablefloat {
    public static void main(String[] args) {
        //double(8byte/정확도가 더 높음), float (4byte)
        float f1 = 10;
        System.out.println(f1);

        //정확도에 가까운 값으로 지수로 저장하게 됨
        f1 = (float)9.77;
        f1 = 9.77f;
        f1 = 9.77F;
        System.out.println(f1);

        long l1  = 100;
        float f2 = l1; //자동형변환 _ 지수계산으로 표현을 해주기에 정확한 값은 아님
        System.out.println(f2);

        double d1 = 8.77;
        System.out.println(d1);
    }
}
