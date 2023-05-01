package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();

        System.out.println(~val1);
        System.out.println(Integer.toBinaryString(val1));
        System.out.println(Integer.toBinaryString(~val1));
    }
}
