package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User teacher = new User();
        teacher.name="경록 강사님";
        teacher.PhoneNumber="010-1234-1234";
        teacher.age=37;

        System.out.printf("이름 : %s / 휴대폰 : %s / 나이 : %d\n",teacher.name, teacher.PhoneNumber, teacher.age);
        System.out.printf("%s은 성인입니까? : %s\n", teacher.name, teacher.isAdult());

        User manager = new User();
        manager.name="재성 매니저님";
        manager.PhoneNumber="010-0000-0000";
        manager.age=14;
        System.out.printf("이름 : %s / 휴대폰 : %s / 나이 : %d\n",manager.name, manager.PhoneNumber, manager.age);
        System.out.printf("%s은 성인입니까? : %s\n", manager.name, manager.isAdult());
    }
}
