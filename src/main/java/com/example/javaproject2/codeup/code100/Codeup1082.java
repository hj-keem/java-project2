package com.example.javaproject2.codeup.code100;

import java.util.Scanner;
public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputVal = sc.next(); //스트링 값으로 입력 받기.
        int iHexVal = Integer.parseInt(inputVal,16); // 문자열로 받은 문자를 int형 16진수로 변환
        System.out.println(iHexVal); //B 입력 후 출력 시 11
        System.out.printf("%X\n",iHexVal); //int타입의 16진수를 0123456789ABCDEF로 표현. 출력값은 B

    for (int i = 1; i < 15; i++) { //1~F까지 돌리기
        System.out.printf("%s * %X = %X\n",inputVal, i, iHexVal*i); //%s는 내가 입력한 문자열(고정)
        //i가 1~15까지 돌지만 %X로 표현했기 때문에 16진수로 나타남
        //int형 16진수 * %X로 표현한 i 곱하기
        }
    }
}
