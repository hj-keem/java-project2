package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int cnt=0;
        int num = sc.nextInt();

        for(int i=1; num>sum; i++){
                sum=sum+i;
                cnt++;
            }
        System.out.println(cnt);
        }
    }


