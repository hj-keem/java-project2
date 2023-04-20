package com.example.javaproject2.week1;
import java.util.Scanner;

public class ScannerEx2 {

    public void TwoNumScan(){

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 : ");
        System.out.print("첫번째 숫자는 : " + sc.nextInt() + "입니다. ");

        System.out.println("두번째 숫자 : ");
        System.out.print("두번째 숫자는 : " + sc.nextInt() + "입니다. ");
    }
}
