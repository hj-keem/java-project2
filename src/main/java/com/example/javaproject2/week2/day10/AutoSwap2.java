package com.example.javaproject2.week2.day10;

import java.util.Arrays;

public class AutoSwap2 {
    public static void main(String[] args) {
        int[] arr = {2,1,7,9};
        int temp;

         //앞에 것 보다 더 크냐
        for(int i=0; i<5; i++){
            boolean check = arr[i] > arr[i+1];
            if(check == true){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
