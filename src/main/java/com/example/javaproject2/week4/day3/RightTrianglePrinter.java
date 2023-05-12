package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {
    //System.out --> Console
    //BufferedWriter --> Console, File
    //private Printer printer = new ConsolePrinter(); //인터페이스 생성 후 인터페이스 구현채를 넣어줍니다

    public String makeALine(int h, int i){
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    public void printToFile(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        for (int i = 0; i < lines.length; i++) {
            bw.append(lines[i]);
            bw.flush();
        }
        bw.close();
    }
    public void printToConsole(String[] lines){
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }

    public void printShape(int h) throws IOException { //모양 출력하기
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h,i+1);
        }
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
        printToFile(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter();
        rtp.printShape(5);
    }
}
