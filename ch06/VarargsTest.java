package com.green.java.ch06;

public class VarargsTest {
    //가변인자
    //정수형 배열로 만들어줌
    public static void main(String[] args) {
        //인수
        sum(1);
        sum(1, 3);
        sum(1, 3, 3);
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int [] arr = {1,2,3};
        sum(arr);
    }

    static void sum(int... nums) { //가변인자
//        System.out.println(nums.length);
        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
        //포이치문으로 작성
        for (int val:nums) {
            sum += val;
        }
        System.out.printf("sum : %d\n", sum);
    }
}
