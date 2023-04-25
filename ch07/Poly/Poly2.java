package com.green.java.ch07.Poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog;
        //형변환이 가능하면 true 아니면 false가 뜸
        System.out.println("r1: " + r1);
        Bulldog bd1 = (Bulldog) ani1;

        System.out.println("r2 : "+ (ani1 instanceof Cat));
    }
}
