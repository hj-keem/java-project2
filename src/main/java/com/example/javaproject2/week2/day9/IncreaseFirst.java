package com.example.javaproject2.week2.day9;

public class IncreaseFirst {
    public static void main(String[] args) {
        //배열 연산 시 사용
        int idx = 0;
        int[] arr = {2,1,7,4};

        System.out.println(arr[idx]); // idx=0, 첫번째 인덱스인 2가 출력 됨
        idx += 1; //idx=0 에서 1을 더한다.
        System.out.println(arr[idx]); //dx = 1, 두번째 인덱스인 1이 출력 됨
        idx += 1; // idx=1 에서 1을 더 더함
        System.out.println(arr[idx]); //idx=2, 세번째 인덱스인 7이 출력 됨
    }
}
