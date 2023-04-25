package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String one = word.substring(0,1);
        String two = word.substring(1,2);
        String three = word.substring(2,3);

        System.out.printf("'%s'\n",one);
        System.out.printf("'%s'\n",two);
        System.out.printf("'%s'\n",three);
    }
}
