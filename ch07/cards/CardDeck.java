package com.green.java.ch07.cards;

import com.green.java.ch06.Car;

import java.util.Arrays;

public class CardDeck {
    Card[] cards;
    int idx = 0;
    public CardDeck() {
        cards = new Card[52];
//        for (int i = 0; i < cards.length; i++) {
//            cards[i] = new Card("","");
//        }
        int idx = 0;
        for (int i = 0; i < Card.KINDS.length; i++) { //4번돌음
            for (int z = 1; z <= Card.NUM_MAX; z++) { //13번 돌음
                String num = null;
                switch (z) {
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(z);
                        break;
                }
                cards[idx++] = new Card(Card.KINDS[i],num);
            }
        }

    }
    void openCards (){
        for (Card c : cards) {
            System.out.println(c);
        }
    }
    void shuffle () {
        for (int i = 0; i < cards.length; i++) {
            int n =(int)(Math.random()* cards.length);
            if (n == i) {continue;} //랜덤을 계속 하라고
            Card temp = cards[n];
            cards[n] = cards[i];
            cards[i] = temp;
        }
    }


    Card pick () {
        if (idx == cards.length) {return null;}
        Card temp = cards[idx];
        cards[idx++] = null;

        return temp;
    }
}
