package com.example.javaproject2.week2.day9;

public class IncreaseFirst3 {
    public static void main(String[] args) {
        int idx = 0;
        int[] arr = {2,1,7,4};

        System.out.println(arr[idx++]); //0에서 시작하여 2 출력 후 1++
        System.out.println(arr[idx++]); // ++되어 두번째 인덱스인 1이 출력 후 1++
        System.out.println(arr[idx--]); // ++되어 세번째 인덱스인 7이 출력 후 1--
        System.out.println(arr[idx--]); // --되어 두번째 인덱스인 1이 출력 후
        System.out.println(arr[idx]); // --되어 첫번째 인덱스인 0이 출력 된다.
        System.out.println("----------------------------------");
        System.out.println(arr[idx++]); //0에서 1 더하기
        System.out.println(arr[++idx]); //1 더한것과 먼저 증감되어 세번째 인덱스인 7이 출력 됨
        System.out.println(arr[idx]); // 이후로 더하거나 마이너스 된 것이 없기 때문에 똑같이 7이 출력 됨
    }
}
