package com.green.java.jk;


public class Member {
    public static void main(String[] args) {
        Member member = new Member(12345, "abcde","서울특별시 강남구 역삼동","student@school.com");
        member.result();
    }
    private int ID;
    private String PW;
    private String Address;
    private String Email;

    public Member(int ID, String PW, String address, String email) {
        this.ID = ID;
        this.PW = PW;
        this.Address = address;
        this.Email = email;
    }
    public void result () {
        System.out.println("학생정보");
        System.out.println("----------------------");
        System.out.println("ID: " + getID());
        System.out.println("PW: " + getPW());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
    }
    public int getID() {
        return ID;
    }

    public String getPW() {
        return PW;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }
}
