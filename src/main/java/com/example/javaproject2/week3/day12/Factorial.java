package com.example.javaproject2.week3.day12;

public class Factorial {
    public static void main(String[] args) {
        int n=5; //문제 풀 때 sc.nextInt() 로 교체
        int answer=1; // answer를 1로 지정하는 것이 핵심 (곱하기 연산이기 때문에 0으로 초기화 하면 안됨)

        for(int i=n; i>0; i--){
            answer = answer * i; //1에서 5까지 곱
        }
        System.out.println(answer);
    }
}
