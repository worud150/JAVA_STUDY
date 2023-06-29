package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer;

    public HarmanSpeaker(Woofer woofer){
        this.woofer = woofer;
    }
    @Override
    public void volumeUp() {
        System.out.println("하만 speaker 소리 올림");
        woofer.sound();
    }

    @Override
    public void volumeDown() {
        System.out.println("하만 speaker 소리 내림");
    }
}
