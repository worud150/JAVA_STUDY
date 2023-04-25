package com.green.java.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();

        buyer.buy(tv);
        buyer.buy(com);

        buyer.printState(); //나의 남은 돈은 700만원 입니다.
    }

}

class Product {
    protected  int price;
    protected  int bonusPoint;


    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
    }

    public int getPrice () {
        return price;
    }
    public int getBonusPoint () {
        return bonusPoint;
    }
}

class Tv2 extends Product {
    public Tv2() {
        super(100);
    }

    public String  toString() { // 오버라이딩 하는 중임
        return "Tv";
    }
}

class Computer extends Product {
    public Computer () {
        super(200);
    }
    public String toString() { // 오버라이딩 하는 중임
        return "Computer";
    }
}
class Buyer {
    private int money;
    private int bonusPoint;

    Buyer(){
        this.money = 1000;
        this.bonusPoint = 0;
    }
    public void buy (Product p) {
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();
        System.out.printf("%s을(를) %,d만원에 구매하였습니다.\n",p.toString(),p.getPrice());
    }

    public void printState (){
        System.out.printf("나의 남은 돈은 %,d만원 입니다.",money);
        System.out.printf("보너스 점수는 %,d점 입니다.",bonusPoint);
    }
}