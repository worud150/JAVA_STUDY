package com.green.java.ch04;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        // while 문으로 해결
        // 1~100 사이의 정수를 입력 :
        //1~ 100사이의 랜덤값

        int input , answer;
        answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);

        boolean num = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("1~100사이의 정수를 풀어보세요");
        input = scan.nextInt();

        while (input != answer) {

            if (input < answer) {
                System.out.println("UP");
            } else if (input > answer) {
                System.out.println("DOWN");
            }
            System.out.print("1~100사이의 정수를 입력하세요 : ");
            input = scan.nextInt();
        }
        System.out.println("정답입니다.");


    }

}
