package com.green.java.jk;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        int menu = 0;
        int num = 0;
        Scanner scan = new Scanner(System.in);

       Break : while (true) {
            System.out.println("메뉴를 선택하세요 (숫자 1,2,3 종료는 0번) ");
            System.out.println("김치찌개 (1)");
            System.out.println("된장찌개 (2)");
            System.out.println("부대찌개 (3)");
            String temp = scan.nextLine();
            menu = Integer.parseInt(temp);

            if (menu == 0) {
                System.out.println("메뉴선택이 끝났습니다.");
                break;
            }else if (!( 1 <= menu && menu <= 3)) {
                System.out.println("메뉴선택을 잘 못 하셨습니다.");
                continue;
            }else {
                while (true) {
                    if (menu == 1) {
                        System.out.println("김치찌개를 선택하셨습니다.");
                    }else if (menu == 2) {
                        System.out.println("된장찌개를 선택하셨습니다.");
                    }else {
                        System.out.println("부대찌개를 선택하셨습니다.");
                    }
                    break Break ;
                }
            }
        }
        System.out.println("주문해주셔서 감사합니다.");
    }
}
