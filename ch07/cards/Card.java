package com.green.java.ch07.cards;

public class Card {
    static final String [] KINDS =
            {"CLOVER","HEART","DIAMOND","SPADE"};//무늬들
    static final int NUM_MAX = 13;//무늬별 카드 수

    String kind; //무늬
    String num; // 번호

    public Card(String kind,String num){ //값을 초기화 했다.
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString () {
        return "kind: " + kind +", num: " + num;
    }
}
