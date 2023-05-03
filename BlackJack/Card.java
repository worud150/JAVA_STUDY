package com.green.java.BlackJack;

public class Card {

    private String patten; // 무늬
    private String denomination; // 숫자

    public Card (String patten, String denomination) {
        this.patten = patten;
        this.denomination = denomination;
    }

    public String getPatten() {
        return patten;
    }

    public String getDenomination() {
        return denomination;
    }
}
