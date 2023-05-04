package com.example.javaproject2.codeup.code100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //O : 한글자씩 읽음 , B : 한줄씩 읽음
        //println , printf -->자동차에 타는 시간

        for(int i=0;i<r;i++){
            for(int j=0;j<g;j++){
                for(int k=0;k<b;k++){
                    bw.append(i+" "+j+" "+k+"\n");
                    cnt++;
                }
                bw.flush();
            }
        }
        System.out.println(cnt);
    }
}
