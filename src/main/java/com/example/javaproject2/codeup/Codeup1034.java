package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octax = sc.next();
        int decimal = Integer.valueOf(octax, 8);

        System.out.printf("%d",decimal);
    }
}