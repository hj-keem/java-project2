package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; num > sum; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}