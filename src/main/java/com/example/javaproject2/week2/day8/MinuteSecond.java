package com.example.javaproject2.week2.day8;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds / 60; // 분
        int remainSeconds = seconds % 60; // 남은 초
        System.out.printf("%d분 %d초", minute, remainSeconds);
    }
}

