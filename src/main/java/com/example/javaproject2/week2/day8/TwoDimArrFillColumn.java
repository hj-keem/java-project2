package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillColumn {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][2]=1;
        arr[1][2]=1;
        arr[2][2]=1;
        arr[3][2]=1;
        arr[4][2]=1;

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
