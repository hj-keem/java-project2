package com.example.javaproject2.codeup.code100;
import java.util.Arrays;
import java.util.Scanner;
public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] students = new int[num];

        for (int i = 0; i < num; i++) {
            int input = sc.nextInt();
            students[i] = input;
        }

        for(int i=students.length-1; i>=0; i--){
            System.out.printf("%d ", students[i]);
        }
    }
}

