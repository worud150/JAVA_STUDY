package com.green.java.ch07;

public class MyTv extends Speaker {
    int channel;
    void channelUp(){channel++;}
    void channelDown(){channel--;}
}

class MyTv2 {
    int channel;
    void channelUp(){channel++;}
    void channelDown(){channel--;}
    Speaker speaker;

    void volumnUp(){
        speaker.volumnUp();
    }
    void volumnDown(){
        speaker.volumnDowm();
    }
    int geVolumn(){
        return speaker.volumn;
    }
}


class Speaker{
    int volumn;

    void volumnUp(){
        volumn++;
    }
    void volumnDowm(){
        volumn--;
    }
}
