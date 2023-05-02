package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
       // System.out.println((int)ch); //97

        for(int c =97; c<=ch; c++){
            System.out.printf("%c\n",c);
        }
    }
}
