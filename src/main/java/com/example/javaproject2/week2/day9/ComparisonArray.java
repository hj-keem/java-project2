package com.example.javaproject2.week2.day9;

import java.util.Arrays;

public class ComparisonArray {
    public static void main(String[] args) {
        //버블정렬 예제. 앞에것과 비교하여 나보다 크면 뒤로 보내 정렬하기
        int[] arr = {2,1,7,9};
        System.out.printf("%d > %d --> %b \n", arr[0], arr[1], arr[0]>arr[1]);
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));

        System.out.printf("%d > %d --> %b \n", arr[1], arr[2], arr[1]>arr[2]);
        System.out.printf("%d > %d --> %b \n", arr[2], arr[3], arr[2]>arr[3]);

        System.out.println(Arrays.toString(arr));
    }
}
