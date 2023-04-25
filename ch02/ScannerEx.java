package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        //개체를 만들었다
        //개체의 주소값만 알면 건들 수 있다
        //변수명 말고 여기서 내가 바꿀 수 없음

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input =scan.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num=%d\n", num);


    }
}
