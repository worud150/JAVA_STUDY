package com.green.java.ch07.arraylist;

public class MyArrayList {

    private int[] items;

    public MyArrayList() {
        items = new int[0];
//        System.out.println(items.length);
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1];

        System.arraycopy(items, 0, temp, 0, items.length);

        temp[items.length] = value;
        items = temp;

    }

    //    public void add (int idx, int num) {
//        int[] temp = new int[items.length + 1];
//
//        for (int i = 0; i < temp.length; i++) {
//            if (i < idx) {
//                temp[i] = items[i];
//            } else if (i == idx) {
//                temp[i] = num;
//            } else {
//                temp [i] = items[i -1];
//            }
//        }
//        items = temp;
//    }
    public void add(int idx, int num) {
        if (idx > items.length) {
            return;
        } // 더 큰 idx값일시 리턴해라.
        int[] temp = new int[items.length + +1];

        temp[idx] = num;
        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items = temp;
    }
//        public String toString() {
//        String str = " ";
//        System.out.print("[" + items[0] );
//        for (int i = 0; i < items.length; i++) {
//            if (i < items[1]) {
//                System.out.printf(", %d", items[i]);
//            }
//        }
//        System.out.print("]");
//        return str;
//    }

    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += "," + items[i];
            }
        }
        str += "]";
        return str;
    }

    public int size() {
        return items.length;
    }

    public int get(int idx) {
        return items[idx];
    }
//    public void print () {
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i]);
//        }
//    }
    // 선택정렬 함
//    public void bubbleSort() {
//        boolean chang = false;
//        for (int i = 0; i < items.length - 1; i++) {
//
//            for (int j = 0; j < items.length - 1 - i; j++) {
//                if (items[j] > items[j + 1]) {
//                    int temp = items[j + 1];
//                    items[j + 1] = items[j];
//                    items[j] = temp;
//                    chang = true;
//                } 
//            }
//
//            if (!chang) {break;}
//            for (int j = 0; j < items.length; j++) {
//                System.out.print(items[j]);
//            }
//            System.out.println();
//        }
//    }
    //정렬
    public void bubbleSort() {
        for (int i = items.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int sideIdx = j + 1;
                if (items [j] > items[sideIdx]) {
                    int temp = items[j];
                    items[j] = items[sideIdx];
                    items[sideIdx] = temp;
                }
            }
        }
    }

    public void set (int idx, int num) {
        items[idx] = num;
    }

    public boolean contains (int idx) {
        for (int val : items) {
            if ( val == idx) {return true;}
        } return false;
    }
}



