package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String frontNum = number.substring(0,6);
        String backNum = number.substring(7,14);

        System.out.println(frontNum+backNum);
    }
}
