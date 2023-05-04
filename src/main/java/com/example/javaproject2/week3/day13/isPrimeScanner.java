package com.example.javaproject2.week3.day13;
import java.util.Scanner;
public class isPrimeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer=0;

        for (int i = 2; i <num ; i++) {
            if(num % i == 0){
                answer ++;
            }
        }
        System.out.printf("%d의 answer값 : %d\n", num, answer);
        System.out.println(answer==0 ? num+"은 소수입니다.": num+"은 소수가 아닙니다.");
    }
}
