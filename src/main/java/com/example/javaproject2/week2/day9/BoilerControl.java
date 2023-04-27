package com.example.javaproject2.week2.day9;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45;
        int roomTemperature =22;

        //둘 다 50보다 낮으면 보일러를 틀어야 함
        boolean result = (waterTemperature < 50 && roomTemperature < 50 ? true : false);
        System.out.println(result == true ? "보일러 켜세요" : "보일러 안 켜도 됨");
    }
}
