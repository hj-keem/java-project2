package com.example.javaproject2.codeup;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String code;
    private String testId;
    private String name;

    public Student(String code, String testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class Codeup3108 {

    private List<Student> studentList = new ArrayList<>();

    private Student makeAStudent(String code, String testId, String name){
        return new Student(code, testId, name);
    }

    private boolean isExist(Student pStudent) {
        // 중복 여부 check
        for (Student student : studentList){
            if(pStudent.getCode().equals(student.getCode())) return true;
        }
        return false;
    }

    private void addAStudent(Student student) {
        if (!isExist(student)) {
            studentList.add(student);
        }
    }
    private void deleteStudent(Student pStudent){ //pStudent란 파라매터리 받은 스튜던트 변수명
        for (int i = 0; i < studentList.size(); i++) {
            if(isExist(studentList.get(i))) studentList.remove(i);
        }
    }

    public void process(Student pStudent) {
        switch (pStudent.getCode()) {
            case "I" : addAStudent(pStudent);
            case "D" : deleteStudent(pStudent);
        }
    }
    private void printStudents(){
        for(Student student : studentList) {
            System.out.printf("%s %s %s\n",student.getCode(), student.getTestId(), student.getName());
        }
    }
    public static void main(String[] args) {
        int size = 1;
        String[] splitted = "I 1011 한라산".split(" ");

        Codeup3108 codeup3108 = new Codeup3108();
        Student student = codeup3108.makeAStudent(splitted[0], splitted[1], splitted[2]);
        System.out.println(student.getCode());
        System.out.println(student.getTestId());
        System.out.println(student.getName());

        codeup3108.process(student);
        codeup3108.addAStudent(student);
        codeup3108.printStudents();
    }
}