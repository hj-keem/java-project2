package com.example.javaproject2.codeup.code100;
import java.util.Scanner;
public class Codeup1367Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.printf(" ");
            }
            System.out.println("*".repeat(n));
        }
    }
}
