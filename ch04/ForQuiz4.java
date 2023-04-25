package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;

//        for (int i = 1; i <= star; i++) {
//            for (int z = 0; z < star-i; z++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//           System.out.println();
//        }


        /************************이거이해하기 무조건 이해하기************************/
//        for (int i = star; i > 0; i--){
//            for (int z = 1; z <= star; z++) {
//                if (z < i) {
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
        /************************이거이해하기 무조건 이해하기************************/


//        System.out.println("---------------------------");

        for (int i = 1; i <= star; i++ ) {
            for (int z = star; i < z; z--) {
                System.out.print(" ");
            }for (int z = 0; z < i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
