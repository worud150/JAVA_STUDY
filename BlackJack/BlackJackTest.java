package com.green.java.BlackJack;

import java.util.Arrays;
import java.util.List;

public class BlackJackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        System.out.println("-----------------------");

        for (Card c: gamer.openCards()) {
            System.out.println(c.getDenomination());
        }

        System.out.println("-----------------------");
        int score = rule.getScore(gamer.openCards());
        System.out.println(score);
    }
}
