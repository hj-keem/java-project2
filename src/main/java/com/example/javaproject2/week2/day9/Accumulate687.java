package com.example.javaproject2.week2.day9;

public class Accumulate687 {
    public static void main(String[] args) { //9:20까지
        //변수, 누적, 연산자, 누적 ,몫
        // 나머지를 구해 누적하기
        int num = 687;
        int answer = 0;

        //나머지를 먼저 구하고
        answer = answer + (num % 10);
        //그 뒤에 몫을 구해야 한다,
        num = num / 10;
        // 68 --> 10으로 나눈 나머지 8
        System.out.printf("num : %d, answer : %d\n", num , answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num : %d, answer : %d\n", num , answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num : %d, answer : %d\n", num , answer);

    }
}
