package com.example.javaproject2.week4.day1;

public class RockPaperSissor {
    public String play(int user, int computer){
        if(user == 0 && computer == 1){//win
            return "win";
        }else if (user == 1 && computer == 2){ //win
            return "win";
        }else if (user == 2 && computer == 0) { //win
            return "win";
        }else if(user == computer) { //tie
            return "tie";
        }else {
            return "lose";
        }
    }
    public static void main(String[] args) {
        //0 - 바위 , 1 - 가위, 2 - 보

        RockPaperSissor rps = new RockPaperSissor();
        System.out.println(rps.play(0, 1));
        System.out.println(rps.play(2, 2));
        System.out.println(rps.play(1, 2));
        System.out.println(rps.play(2, 1));
    }
}

