package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer =0;

        while(n>0){
            while(n>0) { //n이 0이상일 동안 반복
                answer += n % 10;
                n = n / 10;
            }
            int length = (int)(Math.log10(answer)+1);
            if(length > 1){
                n = answer;
                answer=0;
            }else if(length == 1){
                break;
            }
        }
        System.out.println(answer);
    }
}
