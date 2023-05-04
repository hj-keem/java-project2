package com.example.javaproject2.week3.day14;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};
        int targetValue = arr[0]; //배열을 스캔했을 때 가장 작은 값을 넣을 공간
        for (int i = 0; i < arr.length; i++) {
            //targetValue > arr[i] 일 때 교체
            if (targetValue > arr[i]) {
                targetValue = arr[i];
            }
        }
        System.out.println("targetvalue = " + targetValue);
    }
}
