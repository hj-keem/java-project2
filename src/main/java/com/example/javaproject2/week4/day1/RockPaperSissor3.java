package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RockPaperSissor3 {
    public String reTry(int user, int computer) {
        if (user == computer) {
            return "tie, 다시 시도하세요";
        } else if (user == 0 && computer == 2) {
            return "lose, 다시 시도하세요";
        } else if (user == 1 && computer == 0) {
            return "lose, 다시 시도하세요";
        } else if (user == 2 && computer == 1) {
            return "lose, 다시 시도하세요";
        } else {
            return "win! 이겼습니다.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperSissor3 rps3 = new RockPaperSissor3();

        while(true){
            int user=sc.nextInt();
            int computer=sc.nextInt();
            System.out.println(rps3.reTry(2,2));
            System.out.println(rps3.reTry(1,0));
            System.out.println(rps3.reTry(2,1));
        }
    }
}