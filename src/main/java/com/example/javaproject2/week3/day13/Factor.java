package com.example.javaproject2.week3.day13;

public class Factor {
    public static void main(String[] args) { //약수 구하기
        int num=7;
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d %% %d = %d\n",num, i, num%i);
        }

    }
}
