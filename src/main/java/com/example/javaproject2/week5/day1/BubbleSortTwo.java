package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSortTwo {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){ //arr[0] (7)이 arr[j] (2)보다 큰가?
                    int temp = arr[i]; // arr[0]이 크다면 temp에 arr[0] 대입
                    arr[i] = arr[j]; // 기존 arr[0] (첫번째 자리.가장작은 수)에는 j가 들어가게 됨
                    arr[j] = temp; //남은 j 자리에는 arr[0] (7)
                }
            }
        }System.out.println(Arrays.toString(arr));
    }
}

//        int temp=arr[0];
//        arr[1]= arr[0];
//        arr[0]= temp;
//
//        temp = arr[0];
//        arr[2]=arr[0];
//        arr[0]=temp;
//
//        temp = arr[0];
//        arr[3]=arr[0];
//        arr[0]=temp;
//
//        temp = arr[0];
//        arr[4]=arr[0];
//        arr[0]=temp;

