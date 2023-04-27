package com.example.javaproject2.week2.day9;

public class BooleanEx {
    public static void main(String[] args) {
        boolean result = true && true;
        System.out.printf("%b\n", result); //true
        result = true && false;
        System.out.printf("%b\n", result); //false
        result = false && true;
        System.out.printf("%b\n", result); //false
        result = false && false;
        System.out.printf("%b\n", result); //false
    }
}
