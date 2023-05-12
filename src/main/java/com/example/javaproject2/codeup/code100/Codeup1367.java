package com.example.javaproject2.codeup.code100;

import java.util.Scanner;
public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

            for (int i = n; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.printf(" ");
                }
                for(int k=0; k < n; k++){
                    System.out.printf("*");
                }
                System.out.println();
            }
    }
}
//직삼각형 별찍기
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }