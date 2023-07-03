package com.green.java.ch14;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        int n1 = 100;
        int n2 = 200;


        for (int i = n1; i <= n2; i++) {
          myList.add(i);
        }
        System.out.println(myList);

        final IntBox ib = new IntBox();

        myList.forEach(item -> ib.plus(item));
        int sum = ib.getSum();
        System.out.println("sum : " + sum);

        final IntBox ib2 = new IntBox();
        myList.forEach(item -> {
                    if (item  % 2 == 0) {
                        ib2.plus(item);
                    }
                });
        System.out.println("짝수 sum : " + ib2.getSum());


        final IntBox ib3 = new IntBox();
        myList.forEach(item -> {
            ib3.plus(item % 2 == 0 ? item * 2 : item);
        });
        System.out.println("곱하기 sum : " + ib3.getSum());
    }
}
class IntBox {
    private int sum;

    public void plus (int num){
         this.sum += num;

    }

    public int getSum() {
        return sum;
    }

}
