package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexadecimal = sc.nextLine();
        int octax = Integer.valueOf(hexadecimal, 16);

        System.out.printf("%o", octax);
    }
}
