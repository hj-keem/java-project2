package com.example.javaproject2.week2.day7;

public class StringConcat {
    public static void main(String[] args) {
        String str1="ㅎㅇ";
        String str2="ㅂㅇ";
        String result = str1 + " " + str2;
        System.out.println(result);

        String name = "오즈먼드";
        int balance = 2_000_0000;
        String message = name + "님의 통장 잔고는 " +  balance + "원 입니다.";
        System.out.println(message);
    }
}
