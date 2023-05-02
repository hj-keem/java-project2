package com.example.javaproject2.codeup;

public class Digits {
    public static void main(String[] args) {
        int num = 45634;
        int digits = 0;
        while(num > 0){
            num = num / 10;
            digits++;
        }
        int length = (int)(Math.log10(num)+1);
      // (int)Math.log10(num)+1
    }
}
