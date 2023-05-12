package com.example.javaproject2.codeup.code100;
import java.util.Arrays;
import java.util.Scanner;
public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt(); //좌표를 n개 입력
        for (int i = 0; i < n; i++) {
            int first = sc.nextInt();
            int sec = sc.nextInt(); //좌표까지 입력 완료
            //-1 붙여서 다시 해보기
            for (int row = 0; row < 19; row++) {
                    arr[row][first] = arr[row][first] == 1 ? 0 : 1;
                    arr[first][row] = arr[first][row] == 1 ? 0 : 1;
                }
            for(int col = 0; col < 19; col++){
                arr[sec][col] = arr[sec][col] == 1 ? 0: 1;
                arr[col][sec] = arr[col][sec] == 1 ? 0: 1;
            }
        }
        for(int i=0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

//            for(int row=0; row<arr.length; row++){
//                for(int col=0; col<arr.length; col++){
//                    x
//                }
//            }

        }
    }

//System.out.println(Arrays.deepToString(arr));
