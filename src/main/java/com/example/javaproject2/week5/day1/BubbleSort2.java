package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort2 { //기존 코드에서 개선점으로 가장 큰 숫자를 제오하고 돌리는 것
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) { //arr.length-1
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

