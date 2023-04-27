package com.example.javaproject2.week2.day9;

public class BitOperatorEx2 {
    public static void main(String[] args) {
        int val1 = 1; //-2
        int val2 = 0; //-1
        int val3 = 3;

        System.out.println(~val1);
        System.out.println(~val2);
        System.out.println(~val3);
        System.out.println(Integer.toBinaryString(val1));
        System.out.println(Integer.toBinaryString(~val1));

    }
}
