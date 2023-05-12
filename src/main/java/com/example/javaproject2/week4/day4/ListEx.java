package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        //리스트 선언과 초기화
        //Printer pt = new ConsolePrinter() 처럼 부모오브젝트 변수명 = new 자식오브젝트()로 표현
        List l1 = new ArrayList(); //collection을 extends(=상속을 받음) 컬렉션도 인터페이스
        l1.add("Hello");
        System.out.println("li.get(0) : "+l1.get(0));
        l1.add(1);
        System.out.println("li.get(1) : "+l1.get(1));
        System.out.println("l1.size() : "+l1.size()); //들어있는 값들의 개수
        System.out.println("l1.isEmpty() : "+l1.isEmpty());
        l1.remove(0); //0번을 지움
        l1.remove(0); //값이 밀려 1번에 있떤것이 0번으로 지정되고 0번 삭제 (=비었음)
        System.out.println("l1.isEmpty() : "+l1.isEmpty());

        System.out.println("-----------------------");
        for(var item : l1){
            System.out.println(item);
        }
    }
}
