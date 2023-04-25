package com.green.java.ch03;

public class OperatorEX32 {
    public static void main(String[] args) {


      int x = 10, y = -5 , z = 0;
      int absX, absY, absZ;
      //절대값 음수가 없는 값 삼항식

        //간단한
        absX = x >= 0 ? x : -x;
        System.out.println(absX);

        absY = y >= 0 ? y : -y;
        System.out.println(absY);

        absZ = z >= 0 ? z : -z;
        System.out.println(absZ);

        char singX, singY,singZ;


        //조건연산자중첩
        singX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        System.out.printf("x=%c%d\n", singX, absX);

        singY = y > 0 ? '+' : (y==0 ? ' ' : '-');
        System.out.printf("y=%c%d\n", singY, absY);

        singZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
        System.out.printf("z=%c%d\n", singZ, absZ);
    }
}
