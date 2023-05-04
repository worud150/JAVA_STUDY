package com.green.java.BlackJack;

import com.green.java.ch06.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private List<Card> cardList;

    public User() {
        this.cardList = new ArrayList();
    }

    public void receiveCard (Card c) {
        cardList.add(c);
    }

    public List<Card> openCards() {
        return cardList;
    }

    protected int getPointSum() {
        return Rule.getScore(cardList);
    }


    public void showCard() {
        System.out.println("[현재 보유 카드 목록]");
        for (Card c : cardList) {
            System.out.println(c);
        }
    }

}
