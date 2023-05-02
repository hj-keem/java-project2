package com.example.javaproject2.week3.day12;

public class WhileFactorial {
    public static void main(String[] args) {
        // 5! = 120
        int n = 5;
        int answer = 1;
        while(n > 0){
            answer *= n--; //answer = answer * n , n--를 합친 것
        }
        System.out.println(answer);
    }
}
