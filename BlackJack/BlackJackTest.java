package com.green.java.BlackJack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BlackJackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();


        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }

        if (dealer.isReceiveCard()){
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCard();

        String temp;

        gamer.showCard();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Card More? (y/n) >");
            temp = scan.nextLine();

            if (temp.equals("y".toLowerCase().trim())) {
                gamer.showCard();
                gamer.receiveCard(cd.getCard());
            } else if (temp.equals("n")) {
                gamer.showCard();
                break;
            }
        }
        System.out.println("--- 딜러 카드 ---");
        dealer.showCard();

        System.out.println("--- 게이머 카드 ---");
        gamer.showCard();
        System.out.println("--- WINNER ---");

        Rule.whoIsWin(gamer, dealer);
    }
}
