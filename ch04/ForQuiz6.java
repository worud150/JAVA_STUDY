package com.green.java.ch04;

// 2 x 1 = 2
public class ForQuiz6 {
    public static void main(String[] args) {

        for (int i = 1; i <=9; i++ ){
            for (int z = 2; z<=9; z++) {
                System.out.printf("%d x %d = %d\t", z, i, (i * z));
            }
            System.out.println();
        }
    }
}
