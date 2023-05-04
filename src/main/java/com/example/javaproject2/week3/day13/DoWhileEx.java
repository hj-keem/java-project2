package com.example.javaproject2.week3.day13;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num=sc.nextInt(); //do 구간에서 초기화
            if(num!=0){
                System.out.println(num);
            }
        }while(num !=0); //num이 0과 같지 않을동안 반복 -> num이 0과 같아질 때까지 반복
    }
}
