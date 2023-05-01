package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] dateRepo = date.split("\\.");

        int year = Integer.parseInt(dateRepo[0]);
        int month = Integer.parseInt(dateRepo[1]);
        int day = Integer.parseInt(dateRepo[2]);

        System.out.printf("%02d-%02d-%04d",day, month, year);

    }
}
