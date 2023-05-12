package com.example.javaproject2.week4.day5;

import java.io.*;

public class InputStreamReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/kimhyunjung/Desktop/hospital_info.csv"), "EUC-KR"));
        System.out.println(br.readLine());
    }
}
