package com.example.javaproject2.week3.day11;

public class LoopChar {
    public static void main(String[] args) {
        for(char c = 'a'; c <= 'z'; c++) {
         //   System.out.println(c); //세로 출력
            System.out.printf("%c", c); //가로 출력
        }
    }
}