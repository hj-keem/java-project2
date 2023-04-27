package com.example.javaproject2.week2.day9;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int age=18;
        boolean isAdult = age > 18; //만 18세 이상
        System.out.println(isAdult == true ? "성인입니다" : "미성년자입니다");
    }
}
