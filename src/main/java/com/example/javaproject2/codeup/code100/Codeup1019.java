package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String birth = sc.nextLine();
        String[] result = birth.split("\\.");
        int yyyy = Integer.parseInt(result[0]);
        int mm = Integer.parseInt(result[1]);
        int dd = Integer.parseInt(result[2]);

        System.out.printf("%049d.%02d.%02d", yyyy, mm, dd);
    }
}
