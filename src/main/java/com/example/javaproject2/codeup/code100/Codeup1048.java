package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int multi = val1 * (int)(Math.pow(2, val2));

        System.out.println(multi);
    }
}
