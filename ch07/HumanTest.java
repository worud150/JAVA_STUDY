package com.green.java.ch07;
/* private 멤버필드에 값을 대입하고 값을 추출한다.
<값 주입>
1. 생성자 통해서
2. setter 메소드 통해서

<값 추출>
1. getter 메소드 통해서
*/
public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human("김재경",27,"개발자");
        h1.setName("이쁘니");
        h1.setAge(534156854);
        h1.setJob("CEO");

        String name = h1.getName();
        int age = h1.getAge();
        String job = h1.getJob();

        System.out.printf("이름: %s, 나이: %d, 직업: %s\n", name,age,job);
    }

}
