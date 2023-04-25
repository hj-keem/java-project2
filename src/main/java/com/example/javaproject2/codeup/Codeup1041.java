package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); //String 타입으로 입력받음
        char index = word.charAt(0); //입력 받은 값을 아스키코드로 변경 (숫자,문자로 정해진 값을 표현할 수 있기 때문)
        int change=index+1; // 다음 문자를 출력하기 위해 +1 (아스키코드 표 참고)

        System.out.printf("%c", change);
    }
}
