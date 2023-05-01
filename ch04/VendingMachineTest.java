package com.green.java.ch04;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);
        vm.showMenus();
        vm.showMoney();
        System.out.println("-------------------------");
        vm.purchaseDrink(1); // coke
        vm.purchaseDrink(2); // soda
        vm.purchaseDrink(4); //miranda
        vm.showMoney();
        System.out.println("-------------------------");
        vm.showPurchaseList();
    }
}
