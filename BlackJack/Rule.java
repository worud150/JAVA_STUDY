package com.green.java.BlackJack;

import java.util.List;

public class Rule {
    public static final int WIN_NUM = 21;
    public static int getScore(List<Card> cardList) {
       int sum = 0;
        for (Card c: cardList) {
            sum += getDenominationToNum(c);
        } return sum;
    }
    private static int getDenominationToNum(Card c) {
        switch (c.getDenomination()){
            case "A" : return 1;
            case "J" :
            case "Q" :
            case "K" :
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }

    public static void whoIsWin(Gamer gamer, Dealer dealer) {
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();

        if (gPoint <= WIN_NUM &&(gPoint > dPoint || dPoint > WIN_NUM)) {
            System.out.println("게이머 승리");
        } else if (dPoint <= WIN_NUM && (dPoint > gPoint || gPoint > WIN_NUM )) {
            System.out.println("딜러 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
