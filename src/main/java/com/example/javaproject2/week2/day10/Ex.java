package com.example.javaproject2.week2.day10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        //1-1. 입력된 수가 짝수라면 2로 나눕니다.
        //1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        //2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        //6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다
        //500번 시도해도 안되면 -1 반환
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int cnt = 0;

        for (int i = 0; i < 500; i++) {
            if(i>=500) {
                System.out.println("-1");
                break;
            }if (num == 1) {
                System.out.println(i);
                break;
            }if (num % 2 == 0) {
                num /= 2;
                System.out.println(num);
            } else if (num % 3 == 0) {
                num = num * 3 + 1;
                System.out.println(num);
            }
        }
    }
}




//        while(num != 1){
//            if(num % 2 ==0){
//                num = num / 2;
//                cnt++;
//            }
//            else if(num % 2 ==1){
//                num=num*3 +1;
//                cnt++;
//            }
//            if(cnt >= 500){
//                cnt = -1;
//                break;
//            }
//        }System.out.println(cnt);


//        if(num % 2 == 0){ //입력 받은 값이 짝수일 때
//            num = num / 2 ; //num 변수에 나누기 2 한 값을 저장
//
//            for(int i =2; i<500; i++){ //500번 이상 넘을 시 -1을 반환해야하기 때문에 반복 및 카운트
//                if(num % 2 == 0){ //위에서 연산한 값이 짝수 일 시
//                    num = num/2; // num 변수에 나누기 2 한 값을 저장
//                    System.out.println("num :"+ num);
//                    System.out.println(i);
//                }else if(num % 2 == 1){ // 위에서 연산한 값이 홀수일 시
//                    num = (num * 3) +1; //num 에 곱하기3, +1 한 값을 저장
//                    System.out.println("num :"+ num);
//                    System.out.println(i);
//                }
//                if(num == 1){ //num 의 값이 1이 되었는가? 되었다면 실행
//                    System.out.println(i); //몇번을 거쳤는지 i 출력
//                    break; //for문에서 나감
//                }
//                if(i >= 500){ //i의 값이 500이되거나 넘었는가? 그렇다면 실행
//                    i=-1;//-1을 출력함
//                    break; //for문 탈출
//                }
//            }
//
//        }else if(num % 2 == 1){ // 입력 받은 값이 홀수일 때
//            num = (num * 3) + 1; //num 변수에 곱하기 3, +1
//            for(int i=2; i<500; i++){
//                if(num % 2 ==0){
//                    num = num /2;
//                }else if(num % 2 == 1){
//                    num = num *3 +1;
//                }
//                if(num == 1){ //num 의 값이 1이 되었는가? 되었다면 실행
//                    System.out.println(i); //몇번을 거쳤는지 i 출력
//                    break; //for문에서 나감
//                }
//                if(i >= 500){ //i의 값이 500이되거나 넘었는가? 그렇다면 실행
//                    i=-1; //-1을 출력함
//                    break; //for문 탈출
//                }
//            }
//        }


