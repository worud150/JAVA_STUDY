package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {

        int input , answer;
        answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);
        Scanner scan = new Scanner(System.in);



        do {
            System.out.print("1~100사이의 정수를 입력하세요 : "); //먼저 읽고 지나가기
            String temp = scan.nextLine(); // 화면을 통해 입력받은 내용을 temp에 저장
            input = Integer.parseInt(temp); // 입력받은 문자열을 (temp)을 숫자로 변환. > 그냥 스트링값 (문자열)을 정수로 변환

            if (input < answer) {
                System.out.println("UP");
            } else if (input > answer) {
                System.out.println("DOWN");
            }

        } while (input != answer);
        System.out.println("GOOD");
    }
}
