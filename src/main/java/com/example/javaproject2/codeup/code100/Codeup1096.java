package com.example.javaproject2.codeup.code100;
import java.util.Arrays;
import java.util.Scanner;
public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[5][5];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int row=0; row<5; row++){
                for(int col=0; col<5; col++){
                    arr[x-1][y-1]=1;
                }
            }
        }
        for(int i=0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
