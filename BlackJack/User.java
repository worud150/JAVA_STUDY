package com.green.java.BlackJack;

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

}
