package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        //2차원 배열 arr을 선언하고 첫 번째 0번 인덱스에 있는 첫 번째 행을 선택해
        //1차원 배열 타입 변수에 넣은 후 첫 번째 칸에 1을 할당한 후 출력하는 예제
        int[][] arr = new int[3][3]; //2차원 배열 선언
        int[] arr0 = arr[0]; // 2차원 배열에서 배열을 꺼내 1차원 배열이 됨
        arr0[0]=1; //첫번째 값 할당

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

    }
}
