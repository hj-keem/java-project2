package com.example.javaproject2.week3.day13;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("짝수를 구하시오");
            num = sc.nextInt();
        }while(num % 2 != 0);
        System.out.println("올바른 짝수가 입력되었습니다.");
    }
}
