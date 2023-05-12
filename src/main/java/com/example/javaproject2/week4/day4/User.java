package com.example.javaproject2.week4.day4;
//week1.day4의 User클래스를 복사해온 것
//Getter Setter 연습용
public class User {
        //이름, 나이, 전화번호
        private String name;
        private String PhoneNumber;
        private int age;
        private int password;

        //contructor ----------생성자
        public User(String name, String phoneNumber, int age) {
            this.name = name;
            this.PhoneNumber = phoneNumber;
            this.age = age;
        }

        public User() {
        }


    boolean isAdult(){
            return age >= 18;
        }



        //get 메소드 -----------
        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public int getAge() {
            return age;
        }

        //set 메소드---------
        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public void setAge(int age) {
            this.age = age;
        }


    }

