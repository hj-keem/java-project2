package com.example.javaproject2.codeup.code100;
import java.util.Scanner;
public class Codeup1671 {
    public static void main(String[] args) {
        //0 - 바위 , 1 - 가위, 2 - 보
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();

        if(user == 0 && computer == 1){//win
            System.out.println("win");
        }else if (user == 1 && computer == 2){ //win
            System.out.println("win");
        }else if (user == 2 && computer == 0) { //win
            System.out.println("win");
        }else if(user == computer) { //tie
            System.out.println("tie");
        }else {
            System.out.println("lose");
        }
    }
}
