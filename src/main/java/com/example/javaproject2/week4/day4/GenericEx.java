package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        //List<타입>
        List<String> strList = new ArrayList<>(); //String 문자열 사용
        strList.add("hello");
        strList.add("bye");
        strList.add("1");

        List<Integer> intList = new ArrayList<>(); //int 정수형 사용
        intList.add(1);
        intList.add(2);

        System.out.println("---------------");
        for(String item : strList){
            System.out.println(item.split(" "));
        }
    }
}
