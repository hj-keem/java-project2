package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        //1초 동안 마이크로 소리강약을 체크하는 수를 h
        //한 번 체크한 결과를 저장하는 비트 b
        //(2비트를 사용하면 0 또는 1 두 가지, 16비트를 사용하면 65536가지..)
        //좌우 등 소리를 저장할 트랙 개수인 채널 c
        //(모노는 1개, 스테레오는 2개의 트랙으로 저장함을 의미한다.)
        //녹음할 시간 s가 주어질 때
        //필요한 저장 용량을 계산하는 프로그램을 작성해보자.
        Scanner sc = new Scanner(System.in);
        long hz = sc.nextLong();
        long bit = sc.nextLong();
        long chanel = sc.nextLong();
        long stime = sc.nextLong();

       double result = (double)(hz * bit * chanel * stime)/8/1024.0f/1024.0f;
        System.out.printf("%.1f MB\n",result);
    }
}
