package com.green.java.ch04;

public class FlowEx20 {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 1; i <= num; i++){
            for (int z = 1; z<= num; z++){
                System.out.printf("[%d, %d]\t",i, z);
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++){
            for (int z = 1; z<=3; z++){
               if (i==z){
                   System.out.printf("[%d, %d]\t",i, z);
               }else {
                   System.out.printf("%c", ' ');
               }
            }
            System.out.println();
        }
    }
}
