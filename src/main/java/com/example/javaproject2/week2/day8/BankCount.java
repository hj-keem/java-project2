package com.example.javaproject2.week2.day8;

public class BankCount {
    public static void main(String[] args) {
        int myAccount = 1_000_000;
        myAccount = myAccount - 500_000;
        System.out.println(myAccount);

        myAccount = myAccount + 400_000;
        System.out.println(myAccount);
    }
}
