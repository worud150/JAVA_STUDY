package com.green.java.ch04;

public class ForQuiz3 {
    public static void main(String[] args) {

//        for (int i = 0; i<3; i++) {
//
//            for (int z =0; z < 5; z++){
//                System.out.printf("i: %d, z: %d\n", i, z);
//            }
//
//        }



        for (int i = 0; i < 5; i++ ) {
            for (int z = 0; z < 5; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int star = 6;
        for (int i = 0; i < star; i++){
            for (int z = 0; z < star; z++){
                System.out.print("*");
            }
            System.out.println();
        }



        int star1 = 5;



        for (int i = 1; i <=star1; i++){
            for (int z = 1; z <= star1; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0 ; i <= star1; i++){
            for (int z = 0; z <= i; z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
