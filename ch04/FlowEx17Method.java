package com.green.java.ch04;

import org.w3c.dom.ls.LSOutput;

public class FlowEx17Method {
    public static void main(String[] args) {
        int star = 5;

       printstarLine(star);
       printstarLine(3);
        System.out.println("----------------");
       printstarRect(3);
        System.out.println("----------------");
        printstartri(4);
    }

    public static void printstarLine(int star) {
        for (int i = 0; i < star; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    //재활용성을 높여야함
    public static void printstarRect(int star) {
        for (int z = 0; z < star; z++){
            printstarLine(star);
        }
        System.out.println();
    }
//    public static void printstarRect(int star) {
//        for (int z = 0; z < star; z++){
//            for (int i = 0; i < star; i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    // 반복되는 값을 바꿔주기
    public static void printstartri(int star) {
        for (int z = 0; z <= star; z++){
            printstarLine(z);
        }
        System.out.println();
    }
//    public static void printstartri(int star) {
//        for (int z = 0; z <= star; z++){
//            for (int i = 0; i < z; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}
