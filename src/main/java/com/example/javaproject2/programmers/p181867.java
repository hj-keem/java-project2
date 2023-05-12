package com.example.javaproject2.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class p181867 {
    public static void main(String[] args) {
        //x사이의 개수
        Scanner sc = new Scanner(System.in);
        String[] mystr = sc.nextLine().split("x",-1);
        int[] answer = new int[mystr.length];
        System.out.println(Arrays.toString(mystr));
        System.out.println(mystr[0]);
        System.out.println(mystr.length);
        System.out.println("-----------------------");

        for(int i =0; i<mystr.length; i++){
            int num = mystr[i].length();
            answer[i]+=num;
        }
        System.out.println(Arrays.toString(answer));
    }
}
