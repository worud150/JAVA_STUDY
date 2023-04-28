package com.green.java.ch03;

public class OperatorEX32Quiz {
    public static void main(String[] args) {

      OperatorEX32Quiz op = new OperatorEX32Quiz();

      int x = 10, y = -8 , z = 0;
      int absX, absY, absZ;

//      op.getAbs(x);
//      op.getAbs(y);
//      op.getAbs(z);

      System.out.println("absX : " + op.getAbs(x));
      System.out.println("absY : " + op.getAbs(y));
      System.out.println("absZ : " + op.getAbs(z));

    }


  public int getAbs (int n) {
    return n >= 0 ? n : -n;
  }

}
