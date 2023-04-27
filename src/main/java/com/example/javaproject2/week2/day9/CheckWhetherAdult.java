package com.example.javaproject2.week2.day9;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int age=30;
        boolean isAdult = age >= 18; //만 18세 이상
        System.out.printf("미성년자입니까? %b", !isAdult);
    }
}
