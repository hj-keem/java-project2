package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;

        for(int i =0; i <= num; i +=2){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
