package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RockPaperSissor2 {
    public static void main(String[] args) {
        //0-바위, 1-가위, 2-보
        Scanner sc = new Scanner(System.in);
        // user : 0 / computer :1
        // user : 1 / computer :2
        // user : 2 / computer :0

        while(true){
            int user=sc.nextInt();
            int computer=sc.nextInt();
            if(user==computer){
                System.out.println("tie, 다시 시도하세요");
            }
            else if(user==0 && computer==2){
                System.out.println("lose, 다시 시도하세요");
            }
            else if(user==1 && computer==0){
                System.out.println("lose, 다시 시도하세요");
            }
            else if(user==2 && computer==1){
                System.out.println("lose, 다시 시도하세요");
            }
            else {
                System.out.println("win!");
                break;
            }
        }
    }
}
