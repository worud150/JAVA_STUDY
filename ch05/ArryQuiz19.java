package com.green.java.ch05;

public class ArryQuiz19 {
    public static void main(String[] args) {

        /************ 오늘 이해 하기 ***************/
        //수정에 용이하다
        String [] titles = {"국어","영어","수학"};
        int [] titlesumArr = new int[titles.length]; //합계값
        int[][] score = {
                {100, 90, 80},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
        };
        System.out.print("번호\t");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s\t", titles[i]);
        }
        System.out.println("총점\t평균");
        System.out.println("===========================");
        for (int i = 0; i < score.length; i++) {
            int[] eachScore = score[i];
            int sum = 0;
            System.out.printf("%3d\t",i +1);
            for (int z = 0; z < eachScore.length; z++) {
                int jumsu = eachScore[z];
                System.out.printf("%3d\t",jumsu);
                sum += eachScore[z];
                titlesumArr[z] += eachScore[z];
            }
            System.out.printf("%3d\t%4.1f\n",sum, ((double)sum / eachScore.length));
        }
        System.out.println("============================");
        System.out.println("총점");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s:%d\n", titles[i],titlesumArr[i]);
        }
    }
}
