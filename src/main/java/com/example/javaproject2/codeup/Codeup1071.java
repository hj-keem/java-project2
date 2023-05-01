package com.example.javaproject2.codeup;

import java.util.Scanner;
public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2147483647; i++){
            int num = sc.nextInt();
            if(num!=0){
                System.out.printf("%d \n",num);
            }else if(num==0){
                break;
            }
        }
    }
}
