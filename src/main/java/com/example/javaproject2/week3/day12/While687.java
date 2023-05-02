package com.example.javaproject2.week3.day12;

import java.util.Scanner;

public class While687 {
    public static void main(String[] args) {
        int n = 687;
        int answer=0;

        while(n>0){
            answer += n%10; //나머지 먼저 구해주기
            n = n / 10; //몫
        }
        System.out.println("answer : "+answer +"n : "+ n);
    }
}
