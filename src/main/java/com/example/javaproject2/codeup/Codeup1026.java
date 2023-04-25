package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] result = time.split(":");

        int min = Integer.parseInt(result[1]);
        System.out.println(min);
    }
}
