package com.example.javaproject2.week1.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); //카트 가지고 오기

        System.out.println("Line1 = " + br.readLine());
        System.out.println("Line2 = " + br.readLine());
    }

}