package com.green.java.ioc.next;

import com.green.java.ioc.Woofer;

public class BoWoofer implements Woofer {
    @Override
    public void sound() {
        System.out.println("B&O woofer 소리~~");
    }
}
