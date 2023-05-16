package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSortRefactoring {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        //1 1 0
        //2 2 1
        //2 1 2
        //3 3 2
        //3 2 1
        //3 1 0
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) { // j가 0까지 빼줍니다.
                System.out.printf("i : %d j : %d j-1 : %d\n", i,j, j-1);
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else { // 하나 하나 다 도는 것을 막기 위해서 비교하지 않아도 되는 것들은 제외
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

