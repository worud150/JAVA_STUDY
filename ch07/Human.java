package com.green.java.ch07;

public class Human { // 디폴트여도 객체화 가능함 같은 패키지라서
    private String name;
    private int age;
    private String job;


    public Human () {}
    public Human(String name, int age, String job) { // 생성자 이용해서 접근하기
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getJob() {
        return this.job;
    }
}
