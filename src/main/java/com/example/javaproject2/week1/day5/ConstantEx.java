package com.example.javaproject2.week1.day5;

import com.example.javaproject2.week1.day2.PrintHello;

public class ConstantEx {
    public static void main(String[] args) {
        final int iVal; // 상수 선언 final
        iVal=1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();
        //바뀌면 안되기 때문에 final을 붙여줌
    }
}
