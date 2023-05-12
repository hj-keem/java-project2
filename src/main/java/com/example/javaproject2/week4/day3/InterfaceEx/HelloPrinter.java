package com.example.javaproject2.week4.day3.InterfaceEx;

import java.io.IOException;

public class HelloPrinter {
    //파일에도 저장하고싶고, 콘솔에도 출력하고 싶음
    Printer2 printer = new ConsolePrinter();
//    public void print(String message){ //원하는 메세지를 입력받아 콘솔에 출력
//        System.out.println(message);
//    }

    public HelloPrinter(Printer2 printer) { //cmd+n (construct)
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) throws IOException { //반복
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(5, "hello");
        FilePrinter filePrinter = new FilePrinter();
        filePrinter.print("test");
    }
}
