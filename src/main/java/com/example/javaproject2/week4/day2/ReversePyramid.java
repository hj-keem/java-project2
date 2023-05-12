package com.example.javaproject2.week4.day2;

public class ReversePyramid {
    public ReversePyramid(String spaceChar) { //생성자를 붙여야 켜고끌수있다.(0에서 공백으로 변경가능), 생성자를 이용해 안에 변화를 줌
        this.spaceChar = spaceChar;
    }

    private String spaceChar=" "; //spaceChar멤버변수로 선언
    //메소드로 핵심 분리
    public String makeALine(int h, int i){
        //1//return String.format("%d %d\n", i , h+3 - ( i*2 )); //공백과 별을 찍을 숫자를 먼저 구함 (핵심로직)
        //2//return String.format("%s %s\n", "0".repeat(i), "*".repeat(h+3-(i*2))); //repeat을 이용하여 표현
        return String.format("%s %s\n", spaceChar.repeat(i), "*".repeat(h+3-(i*2)));
        //3//0 자리를 spaceChar의 값으로 바꿔주기 위해서 "0".repeat(i)자리에 spaceChar.repeat(i)로 바꿔준다.

    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.print(reversePyramid.makeALine(h,i));

        }
    }
}
