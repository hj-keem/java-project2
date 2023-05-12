package com.example.javaproject2.week4.day3.InterfaceEx;

public class ConsolePrinter implements Printer2{ //구현체
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
