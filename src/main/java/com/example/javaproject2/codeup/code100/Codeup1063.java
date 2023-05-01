package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int result1 = val1 > val2 ? val1 : 0;
        int result2 = val1 < val2 ? val2 : 0;
        System.out.println(result1 > result2 ? result1 : result2);
    }
}
