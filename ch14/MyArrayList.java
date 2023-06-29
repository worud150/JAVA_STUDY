package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept (int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test (int num);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        this.arr = new int[0];
    }

    public void add (int val) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = val;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void forEach(MyConsumer consumer) {
        // 함수형 프로그래밍
        for (int i = 0; i < arr.length; i++) {
            consumer.accept(this.arr[i]);
        }
    }

    public MyArrayList filter (MyPredicate predicate) {
        return null;
    }
    @Override
    public String toString () {

//        System.out.print("[" + arr[0]);
//        for (int i = 1; i < arr.length; i++) {
//            System.out.print("," + arr[i]);
//        }
//        System.out.println("]");
//
//        return "";

        StringBuilder sb = new StringBuilder("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append("," + arr[i]);
        }
        sb.append("]");
        return sb.toString();

    }


}
