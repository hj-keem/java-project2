package com.example.javaproject2.week3.day11;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) throws IllegalAccessException {
        String day = "수";
        String time = "휴진";
        String ClinicHours = switch(day) {
            case "월", "화", "목", "금"-> time = "09:30-18:30";
            case "토"-> time = "09:30-13:00";
            case "수", "일"-> time = "휴진";
            default -> throw new IllegalAccessException("잘못된 요일"+day);
        };
        System.out.printf("%s요일은 %s입니다.", day, time); }
}