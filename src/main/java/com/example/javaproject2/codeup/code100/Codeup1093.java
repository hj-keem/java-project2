package com.example.javaproject2.codeup.code100;

import java.util.Arrays;
import java.util.Scanner;
public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //개수 입력받기
        int[] students = new int[24]; //배열 변수선언

        for (int i = 1; i <= num; i++) { // 입력한 숫자만큼 반복
            int input = sc.nextInt(); // num개수만큼 무작위로 숫자 입력
            students[input-1] +=1; // 순서대로 arr[input-1] 자리에 1채워주기 (자리배치)
        }
        for(int i=0; i<24; i++){
            System.out.printf("%d ",students[i]);
        }
    }
}
