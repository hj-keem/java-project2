package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int result=a;

        for (int i = 1; i <n; i++) {
            result *= r;
        }
        System.out.println(result);
    }
}
