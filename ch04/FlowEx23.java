package com.green.java.ch04;

public class FlowEx23 {
    public static void main(String[] args) {
       int i = 5;
       while (i > 0) {
           i--; // 먼저읽고 나서 진행 이미 -1이 진행됨
           System.out.printf("%d - I can do it\n",i);
       }
//       int z = 11;
//        System.out.println("카운트다운을 시작합니다");
//
//        while (--z != 0) {
//
//            System.out.println(z);
//            for (int j = 0; j < 2_000_000_000; j++){
//                     ;
//            }
//        }
//        System.out.println("GAME OVER");
//        int i =11;
//        for (; i <=10; i++);
//        {
//            System.out.println("i = " + i);
//        }
    }
}
