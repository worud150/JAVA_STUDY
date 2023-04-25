package com.green.java.ch06;

public class Time {

    //private 외부접근 금지
    //멤버필드 중에 상수만 퍼블릭 가능함 어차피 값이 변하지 않음
    //값을 넣는 법 생성자 이용해서
    //메소드를 이용해서 값 넣을 수 있다 (setter)
    //static이 붙이면 값이 하나밖에 못 넣는다
    //값을 빼는건 (getter)
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    //메소드를 이용해서 값을 넣으면 장점
    //값을 통제할 수가 있음 출입구를 하나만 만들어 줌
    public void setHour(int hour) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
