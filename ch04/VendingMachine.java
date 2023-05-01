package com.green.java.ch04;

import java.util.Arrays;
import java.util.LinkedList;

public class VendingMachine {

    private int money;
    private String[] menu = {"콜라", "사이다", "환타", "미란다"} ;
    private int[] price = {1000,1500,2000,2500};
    private LinkedList<Integer> purchaseList = new LinkedList<>();

    public void insert (int money){
        this.money += money;
    }
    public void showMoney () {

        System.out.printf("현재 잔액은 %,d원 입니다.\n",money);
    }

    public void showMenus () {
        System.out.println("번호\t 메뉴\t\t가격");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. \t %s \t %,d원\n", i + 1 , menu[i], price[i]);
        }
    }
    public void purchaseDrink(int num) {
        int idx = num - 1;

        System.out.printf("%s를 구매하였습니다\n", menu[idx]);
        this.money -= price[idx];
        purchaseList.add(idx);
    }
    public void showPurchaseList(){
        if (purchaseList.size() == 0) {
            System.out.println("제품을 구매하지 않았습니다.");
            return;
        }

            int idx = purchaseList.get(0);
            System.out.print(menu[idx]);

            for (int i = 0; i < purchaseList.size(); i++) {
                idx = purchaseList.get(i);
                System.out.printf(", %s", menu[idx]);
            }
        System.out.println("을(를) 구매하였습니다.");

    }
}
