package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String name = "김재경";
        System.out.print("나이입력: ");

        int age = scan.nextInt();
        System.out.printf("나의 이름은 %s이고 나이는%d살입니다", name, age);
        //System.out.printf("나의 이름은 %s이고 나이는%d살입니다", name, age - 1 );
        //만나이

        scan.close();
        /*
        *
        */

    }
}
