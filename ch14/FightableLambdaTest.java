package com.green.java.ch14;

public class FightableLambdaTest {
    public static void run (Fightable f) {
        f.punch();
    }
    public static void main(String[] args) {
        Fightable f1 = () -> {
            System.out.println("람다식으로 작성하기");
        };
       run(f1);
    }
}
