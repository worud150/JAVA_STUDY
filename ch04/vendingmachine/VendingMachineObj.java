package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineObj {

    private int money;
    private List<Drink> list = new ArrayList<>();
    public VendingMachineObj () {
        list = new ArrayList<>();
        list.add(new Drink(1000,"콜라","코카콜라", 500));
        list.add(new Drink(1500,"사이다","칠성", 450));
        list.add(new Drink(2000,"환타","코카콜라", 500));
    }


    public void insert (int money) {
        this.money += money;
    }
    public void showMoney (){
        System.out.printf("현재 잔액은 %,d원 입니다.\n",this.money);
    }
    public void showMenus() {
        System.out.println("번호\t메뉴명 가격\t 회사\t용량");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%02d. %-4s %,d원 %-4s %,d\n",
                    i+1, list.get(i).getName(),list.get(i).getPrice(),list.get(i).getCompany(),list.get(i).getMl());
        }

    }
    public void purchaseDrink(int num) {
        Drink d = list.get(num - 1);
        System.out.println(d.getName()+ "을(를) 구매하였습니다.");
        this.money -= d.getPrice();
    }
}
