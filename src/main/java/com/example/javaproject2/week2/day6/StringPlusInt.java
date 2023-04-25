package com.example.javaproject2.week2.day6;

public class StringPlusInt {
    public static void main(String[] args) {
        System.out.println(1+"1");
        String result = 1+"1";
        //int result = 1+"1"; // 이건 안됨
        System.out.println("result = " + result);

        //Q. 왜 int에는 에러나고 String은 되는가?
        //A. 자바기준 String > int로 입력되어 있기 때문
        // 큰쪽으로는 자동으로 해주는데 작은쪽으로는 수동으로 해야 한다.

        int iResult = 1 + Integer.parseInt("1");
        System.out.println("iResult : "+ iResult);
    }
}
