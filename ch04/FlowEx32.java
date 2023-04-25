package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;

        Scanner scan = new Scanner(System.in);


        Break : while (true) {
            System.out.println("(1) squre");
            System.out.println("(2) squre root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴 (1~3)를 선택 하세요(종료 : 0)");
//            String temp = scan.nextLine();
//            menu = Integer.parseInt(temp);
             menu = scan.nextInt();
            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if (!(menu <= 1 || menu <=3)) {
                System.out.println("메뉴를 잘 못 선택하셨습니다. (종료 : 0)");
            }else {
                System.out.printf("선택하신 메뉴는 %d 입니다.\n", menu);
            }break Break;
        }
    }
}
