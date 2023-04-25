package com.green.java.jk;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++){
//            System.out.println(i);
//        }
//        for (int z = 1; z <=5; z++){
//            System.out.print(z);
//        }
//        System.out.println("----------------");
//
//        int num = 0;
//        for (int i = 1; i <=10; i++){
//            num += i;
//            System.out.printf("1부터 %2d의 합은 : %d\n", i,num);
//        }
//        System.out.println("----------------");
//        for (int i = 1, j = 10; i <=10; i++,j--) {
//            System.out.printf("%d\t%d\n", i ,j);
//        }
//        System.out.println("----------------");
//
//        for (int i=1; i <=10; i++) {
//            System.out.printf("%d \t %d\n", i, 11-i);
//        }
//        System.out.println("----------------");

        for (int i = 1; i <=10; i++){
            System.out.print("*");
        }
        System.out.println("----------------");

        for (int i = 1; i <= 5; i++) {
            for (int z = 1; z<=5; z++){
                System.out.print("*");
            }
            System.out.println();
        }
        int star = 5;
        for (int i = 1; i <= star; i++){
            for (int z = 1; z <=i; z++){
                System.out.print("*");
            }
            System.out.println("--------------");
        }
        for (int j = 1; j <= star; j++){
            for (int a = j; a<=star; a++){
                System.out.print("*");
            }
            System.out.println();
        }

        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("*을 출력할 라인의 갯수를 작성하세요>");
        String temp = scan.nextLine();
        num = Integer.parseInt(temp);

        for (int i = 1; i <= num; i++){
            for (int z = i; z <= num; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        int gugudan = 2;
        for (int i = gugudan; i <=9; i++){
            System.out.printf("%d X %d : %d\n", gugudan, i, (i*gugudan));
        }
        System.out.println();

        for (int i = 2; i <=9; i++){
            for (int z = 1; z <=9; z++){
                System.out.printf("%d X %d = %d\n", i , z, (i*z));
            }
            System.out.println();
        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("출력하고 싶은 구구단을 입력하세요");
//        int num = scan.nextInt();
//
//        for (int i = num; i <=9; i++) {
//            System.out.printf("%d X %d = %d\n", num, i, (num * i));
//        }
//        int star = 5;
//        for (int i = 1; i <=star; i++){
//            for (int j = star; i < j; j--){
//                System.out.print(" ");
//            }for (int z = 0; z < i; z++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
