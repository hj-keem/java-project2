package com.example.javaproject2.week2.day10;

public class SwitchCaseDayOfWeek {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        switch(dayOfWeek){
            case 1 :
                System.out.println("월");
                break;
            case 2 :
                System.out.println("화");
                break;
            case 3 :
                System.out.println("수");
                break;
            case 4 :
                System.out.println("목");
                break;
            case 5 :
                System.out.println("금");
                break;
            case 6 :
                System.out.println("토");
                break;
            case 7 :
                System.out.println("일");
                break;
            default:
                System.out.println(dayOfWeek+"에 해당하는 요일은 없습니다.");
        }
    }
}
