package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[2][0]=1;
        arr[2][1]=1;
        arr[2][2]=1;
        arr[2][3]=1;
        arr[2][4]=1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));

        System.out.println("------------For문으로 나타내기 ------------");

        // for문으로 나타내기
        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
