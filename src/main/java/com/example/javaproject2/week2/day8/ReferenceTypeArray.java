package com.example.javaproject2.week2.day8;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2]; //배열의 크기는 2로 초기화 했지만 바로 사용할 수는 없다.
        students[0] = new Student(); //student[0]에 있는 객체도 초기화 해주어야 한다.
        students[0].name = "김경록";
        students[0].phoneNumber = "010-1234-1234";
        students[0].age = 25;

        students[1] = new Student();
        students[1].name = "김지유";
        students[1].phoneNumber = "010-1234-1234";
        students[1].age = 27;

        System.out.printf("[0] : %s / %s / %d\n",students[0].name, students[0].phoneNumber, students[0].age);
        System.out.printf("[1] : %s / %s / %d",students[1].name, students[1].phoneNumber, students[1].age);

    }
}
