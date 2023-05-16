package com.example.javaproject2.week5.Addition;

public class Codeup3018 {
    public Student parse(String str){
        String[] split = str.split("");
        return new Student(split[0], Integer.parseInt(split[1]), split[2]);
    }
    //Student를 넘긴다는 게 Student 클래스에 있는 멤버변수(전역변수)를 사용한다는 걸로 이해하고 있는데 맞을까요?
    public void process(String str){
        Student student = parse(str);
        if("I".equals(student.getCode())) {
    }
}
