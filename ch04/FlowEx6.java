package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("현재월을 입력하세요. (1월 ~ 12월)");

        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        String season = "";
        switch (mon) {
            case 1:
            case 2:
            case 12:
                season ="겨울";
                break;
            case 3:
            case 4:
            case 5:
                season ="봄";
                break;
            case 6:
            case 7:
            case 8:
                season ="여름";
                break;
            case 9:
            case 10:
            case 11:
                season ="가을";
                break;
        }
        if (! "".equals(season)) { //빈칸 값비교는 앞에다가 빈칸두기
            System.out.printf("현재의 계절은 %s 입니다.", season);
        } else  {
            System.out.println("1년은 1월부터 12월까지 입니다.");
        }

    }
}
