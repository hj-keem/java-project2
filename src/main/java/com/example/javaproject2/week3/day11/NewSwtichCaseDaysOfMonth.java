package com.example.javaproject2.week3.day11;

public class NewSwtichCaseDaysOfMonth {
    public static void main(String[] args) throws IllegalAccessException {
        int month = 11;
        int lastDate = switch(month){
            case 1,3,5,7,8,10,12 -> 31; //lastDate의 타입에 영향을 받기 때문에 int형으로 //->는 타입추론을 해준다.
            case 4,6,9,11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalAccessException("해당 월은 없습니다. 입력일 : "+month); //error를 던져줌
        };

        System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDate);
    }
}
