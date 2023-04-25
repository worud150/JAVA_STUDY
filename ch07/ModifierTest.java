package com.green.java.ch07;

public class ModifierTest {
        private int num1; //제일 많이 사용됨 내부에서만 사용이 가능함
        int num2; //실무에서 거의 사용을 안함 같은 패키지안에서 사용이 가능함 ch07 안에서
        protected  int num3; // 상속관계안에서까지 사용이 가능함 패키지가 달라도
        public int num4; // 제일 많이 사용됨 기본 패키지가 달라도 사용이 가능함 그냥 다 사용이 가능함

        public void printNum1 (){
            System.out.println(num1);
    }
}
