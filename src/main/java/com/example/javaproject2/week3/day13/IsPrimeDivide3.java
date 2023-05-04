package com.example.javaproject2.week3.day13;

public class IsPrimeDivide3 {
    public static void main(String[] args) {
        int num = 6;
        int factors = 0;
        for (int i = 2; i * i <= num; i++) { //루트
            if (num % i == 0) {
                factors++;
            }
            System.out.printf("factors: %d\n", factors);
            System.out.println(factors == 0 ? "prime" : "not prime");
        }
    }
}
