package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        gugudan(4);
        gugudan (2, 8);
       gugudan (5, 7);
       //argument 아규먼트, 인수값
    }
    public static void gugudan(int gugudan) { //인자, 파라먼트, 매개변수
        for (int i = 1; i <=9; i++){
            System.out.printf("%d x %d = %d\n",gugudan, i,(i * gugudan));
        }
        System.out.println();
    }
    public static void gugudan(int sDan, int eDan) {
        for (int i = sDan; i <=eDan; i++){
            gugudan(i);
            System.out.println();
        }
    }
}
