package com.green.java.BlackJack;

import com.green.java.ch06.Car;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    public static final String[] PATTENS = {"♠", "♣", "♥", "♦"};
    public static final int CARD_COUNT = 13;

    private List<Card> cardList;

    public CardDeck() {
        this.cardList = new ArrayList();

        for (String pattens : PATTENS) {
            for (int j = 1; j <= CARD_COUNT; j++) {
                cardList.add(new Card(pattens, getDenomination(j)));
            }
        }
    }

    private String getDenomination(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(num);
        }
    }

    public void showSize() {
        System.out.println(cardList.size());
    }

    public Card getCard() {
        int n = (int)(Math.random() * cardList.size());
        return cardList.remove(n);
    }
}
