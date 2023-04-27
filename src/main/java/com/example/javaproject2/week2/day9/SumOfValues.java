package com.example.javaproject2.week2.day9;

public class SumOfValues {
    public static void main(String[] args) { // 배열에 있는 모든 값 더하기
        int answer = 0;
        int[] arr = {2,1,7,4};
        answer = answer + arr[0];
        answer = answer + arr[1];
        answer = answer + arr[2];
        answer = answer + arr[3];

        System.out.printf("%d\n",arr.length);
        System.out.printf("%d\n", answer);


//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//
//        System.out.println(arr[0]+arr[1]+arr[2]+arr[3]);
    }
}
