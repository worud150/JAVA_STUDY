package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28Method {
    public static int getrandomNumber (int min, int max) {
        return (int)(Math.random() * (max-min+1)) + min;
    }
    public static void main(String[] args) {
        int input , answer;
        answer = getrandomNumber (3,5);
        System.out.println(answer);
        Scanner scan = new Scanner(System.in);
    }
}
