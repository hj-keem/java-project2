package com.example.javaproject2.week4.day2;

public class Pyramid3 {
    public static int height = 4; // Static으로 선언

    public static String makeALine(int h , int i){
        return String.format("%s%s", "".repeat(i), "*".repeat(h-i));
    }
        public static void main(String[] args) {
            for (int i = 0; i < height; i++) {
                System.out.println(makeALine(5,i)); //new가 없어도 메인에서 바로 호출 가능
            }
        }
    }
