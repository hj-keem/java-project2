package com.example.javaproject2.week5.day2;

public class SelectionLogic {
    public static void main(String[] args) {
        int[] arr={7,2,3,9,28,11};

        int targetValue = arr[0];
        int targetIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if(targetValue > arr[i]){
                targetValue = arr[i];
                targetIdx = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[targetIdx];
        arr[targetIdx] = temp;
    }
}

