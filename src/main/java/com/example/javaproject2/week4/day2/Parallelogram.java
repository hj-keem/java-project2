package com.example.javaproject2.week4.day2;

public class Parallelogram {
    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = " ";
    public String parallelogramMakeALine(int i, int h){
       // return String.format("%s %s\n", "0".repeat(i), "*".repeat(h));
       // return String.format("%s %s\n", " ".repeat(i), "*".repeat(h));
        return String.format("%s %s\n", spaceChar.repeat(i), "*".repeat(h));
    }
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram("0");
        Parallelogram parallelogramZero = new Parallelogram(" ");
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.print(parallelogram.parallelogramMakeALine(i, h));
        }
        for (int i =0; i<h; i++){
            System.out.print(parallelogramZero.parallelogramMakeALine(i,h));
        }
    }
}
