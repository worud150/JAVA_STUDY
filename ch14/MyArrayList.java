package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept (int num);
}

@FunctionalInterface
interface MyFunction2 {
    int apply (int num);
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

    public void add(int val) {
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

    @Override
    public String toString() {

//        System.out.print("[" + arr[0]);
//        for (int i = 1; i < arr.length; i++) {
//            System.out.print("," + arr[i]);
//        }
//        System.out.println("]");
//
//        return "";

        StringBuilder sb = new StringBuilder("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(", " + arr[i]);
        }
        sb.append("]");
        return sb.toString();

    }

    public MyArrayList filter(MyPredicate predicate) {

        MyArrayList list = new MyArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                 list.add(arr[i]);
            }
        }
        return list;

    }
    public MyArrayList map (MyFunction2 map) {
      MyArrayList list = new MyArrayList();

        for (int i = 0; i < arr.length; i++) {
          list.add(map.apply(arr[i]));
        }
        return list;
    }
    public void removeIf(MyPredicate predicate) {
        //false로 넘어오는것만 살리자
        int[] temp = new int[this.arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
        int val = arr[i];
            if (!predicate.test(arr[i])) {
                temp[idx++] = val;
            }
        }
        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;
    }
    public void replaceAll(MyFunction2 my) {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = my.apply(this.arr[i]);
        }
    }
}
