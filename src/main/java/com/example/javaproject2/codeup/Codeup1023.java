package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] result = input.split("\\.");
        String res1 = result[0];
        String res2 = result[1];

        System.out.println(res1);
        System.out.println(res2);
    }
}
