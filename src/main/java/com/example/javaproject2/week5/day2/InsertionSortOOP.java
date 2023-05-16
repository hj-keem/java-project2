package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSortOOP {
    public int[] sort(int[] arr, boolean isAscending){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) { // j가 0까지 빼줍니다.
                System.out.printf("i : %d j : %d j-1 : %d\n", i, j, j - 1);
                if (isAscending ? arr[j-1] > arr[j] : arr[j-1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else { // 하나하나 다 도는 것을 막기 위해서 비교하지 않아도 되는 것들은 제외
                    break;
                }
            }
        }
        return arr;
    }
    public int[] sort(int[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        InsertionSortOOP is = new InsertionSortOOP();
        arr = is.sort(arr, true);
        System.out.println(Arrays.toString(arr));
        arr = is.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}
