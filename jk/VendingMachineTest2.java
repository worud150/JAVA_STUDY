package com.green.java.jk;

public class VendingMachineTest2 {
    public static void main(String[] args) {

        VendingMachine2 vm = new VendingMachine2();
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);
        vm.showMenus();
        vm.showMoney();
        System.out.println("-------------------------");
        vm.purchaseDrink(1); // coke
        vm.purchaseDrink(2); // soda
        vm.purchaseDrink(3); //miranda
        vm.showMoney();
        System.out.println("-------------------------");
        vm.showPurchaseList();
   }
}
