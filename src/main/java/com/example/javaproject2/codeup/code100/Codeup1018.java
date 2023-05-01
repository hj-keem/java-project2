package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] result = time.split(":");
        int hour = Integer.parseInt(result[0]);
        int min = Integer.parseInt(result[1]);

        System.out.printf("%d:%d", hour, min);
    }
}
