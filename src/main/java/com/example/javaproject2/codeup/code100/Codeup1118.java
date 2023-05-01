package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        double sum = ((double)row * (double)column) / 2 ;

        System.out.printf("%.1f\n",sum);
    }
}
