package com.example.javaproject2.week2.day9;
public class ComparisonOperatorsEx2 {
    public static void main(String[] args) {
        int iVal1 = 10;
        int iVal2 = 20;

        System.out.printf("iVal1 == iVal2 : %b\n", iVal1 == iVal2); //같냐
        System.out.printf("iVal1 != iVal2 : %b\n", iVal1 != iVal2); //다르냐
        System.out.printf("iVal1 < iVal2 : %b\n", iVal1 < iVal2); //2가 1보다 크냐
        System.out.printf("iVal1 <= iVal2 : %b\n", iVal1 <= iVal2); //2가 1보다 크거나 같냐
        System.out.printf("iVal1 > iVal2 : %b\n", iVal1 > iVal2); //1이 2보다 크냐
        System.out.printf("iVal1 >= iVal2 : %b\n", iVal1 >= iVal2); //1이 2보다 크거나 같냐
    }
}
