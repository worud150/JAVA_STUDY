package com.green.java.ch03;

public class OperatorEX2 {
    public static void main(String[] args) {
       int i = 5, j = 0;

       j = i++;
        System.out.printf("j=i++; 실행 후 i=%d, j=%d\n", i, j);
        //뒷쪽에 ++이 있는경우 원래갖고있던 숫자를 사용하고 올라감

        int i2 = 5, j2 = 0;
        j2 = ++i2;
        System.out.printf("j2=++i2; 실행 후 i2=%d, j2=%d\n", i2, j2);

    }
}
