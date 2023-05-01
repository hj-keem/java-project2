package com.example.javaproject2.week2.day9;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = true;

        if(age >= 18 && isStudent){ //&& -> AND 연산자로 모두 참인지를 확인
            System.out.println("성인이며, 학생이 아닙니다.");
        }
    }
}
