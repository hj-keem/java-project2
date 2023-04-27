package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1051 {
    public static void main(String[] args) {
        //b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.println(val1 <= val2 ? 1 : 0);
    }
}
