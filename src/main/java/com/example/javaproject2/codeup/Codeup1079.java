package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;; i++){
            String str = sc.next();
            char ch=str.charAt(0);
            if(ch != 'q'){
                System.out.println(ch);
            }else if (ch=='q'){
                break;
            }
        }System.out.println("q");
    }
}
