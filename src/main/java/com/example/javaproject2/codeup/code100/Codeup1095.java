package com.example.javaproject2.codeup.code100;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] students = new int[num]; // num에서 입력한 만큼 학생번호 입력
        for(int i=0; i<num; i++){
            int input = sc.nextInt();
            students[i] = input;
        }
        int targetValue=students[0];

        for(int i=0; i < num; i++){
            if(targetValue > students[i]){
                targetValue = students[i];
            }
        }
        System.out.println(targetValue);
    }
}
