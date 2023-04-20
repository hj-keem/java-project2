package com.example.javaproject2.week1.day4;
import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0; // 최초로 값을 지정하는 것을 초기화 라고 한다.
        PrintHello printHello; //변수 선언
        printHello = new PrintHello(); //new를 이용해 인스턴스화 및 초기화

        System.out.println(iVal);
        printHello.print();
    }
}
