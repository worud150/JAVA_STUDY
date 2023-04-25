package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {

        Tv tv = new Tv(); // new라는 키워드는 객체화 하고 싶은 class

        System.out.printf("power : %b\n",tv.power);
        System.out.printf("channel : %d\n",tv.channel);

        tv.power = true;
        System.out.printf("power : %b\n",tv.power);

        tv.power();//호출하면 일을 시켰다라고 표현함/ 티비객체에 있는 채널업메소드를 호출했다
        System.out.printf("power : %b\n",tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d\n",tv.channel);

        tv.channel = 10;
        System.out.printf("channel : %d\n",tv.channel);

        Tv tv2 = tv; //주소값만 복사
        System.out.printf("channel : %d\n",tv2.channel);
    }
}
