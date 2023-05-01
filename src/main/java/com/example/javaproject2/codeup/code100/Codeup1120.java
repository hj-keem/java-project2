package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();

        float avg = ((float)score1 + (float)score2 + (float)score3)/3;
        System.out.printf("%.1f\n",avg);

    }
}
