package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        //오름 차순으로 정렬하는 알고리즘
        int[] arr = {2,1,4,8,7,6};

        int temp = arr[0]; //arr[0]의 값(2)의 값을 temp에 넣어둔다.
        arr[0] = arr[1]; // 비워진 arr[0] 자리에 arr[1]의 값을(1) 넣어둔다.
        arr[1] = temp; // 비워진 arr[1]자리에 temp의 값(2)을 넣는다. 자리바꾸기 완료.

        System.out.println(Arrays.toString(arr));
    }
}
