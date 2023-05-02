package com.green.java.ch04.vendingmachine;

public class VendingMachineObjTest {
    public static void main(String[] args) {
        VendingMachineObj vm = new VendingMachineObj();
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);

        vm.showMenus();
        vm.showMoney();

        System.out.println("-------------------");

        vm.purchaseDrink(1);
        vm.purchaseDrink(2);
        vm.showMoney();
    }

}
