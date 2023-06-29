package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        boolean r1 = (nb1.equals(nb2));
        System.out.println(r1);
    }
}

class NumberBox {
    private int num;

    public int getNum() {
        return num;
    }

    public NumberBox (int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof NumberBox)){
            return false;
        }
        NumberBox nb = (NumberBox)obj;
        nb.getNum();

        return this.num == nb.getNum();
    }
}