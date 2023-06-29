package com.green.java.ch14;

public class FightableTest {
    public static void main(String[] args) {
        StreetFighter sf = new StreetFighter();
        sf.punch();
        run(sf);

        run(new Fightable() { // 익명클래스를 사용한거다.
            @Override
            public void punch() {
                System.out.println("머리 박치기를 한다.");
            }
        });

        Fightable f1 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("hello world");
            }
        };

        f1.punch();
    }

    public static void run (Fightable f) {
        f.punch();
    }
}


class StreetFighter implements Fightable {

    @Override
    public void punch() {
        System.out.println("주먹을 날린다");
    }
}