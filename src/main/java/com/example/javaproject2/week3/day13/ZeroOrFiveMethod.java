package com.example.javaproject2.week3.day13;

public class ZeroOrFiveMethod {
    public static boolean isZeroOrFive(int num){
        while (num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 505;
        System.out.printf("%d는 5와 0으로만 이루어진 숫자입니까? %b\n", num, isZeroOrFive(num));
    }
}
