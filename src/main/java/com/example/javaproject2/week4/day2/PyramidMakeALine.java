package com.example.javaproject2.week4.day2;

public class PyramidMakeALine {
    public PyramidMakeALine(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    private String spaceChar = "0"; // <- 공백 문자를 선언할 수 있음

    public String makeALine(int height, int i){ //한 줄 만들기
        return String.format("%s%s\n",spaceChar.repeat(height-i-1), "*".repeat(2*i+1));
    }
    public void printPyramid(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(height, i));
        }
    }
    public static void main(String[] args) {
        PyramidConstructor pyramid2 = new PyramidConstructor(" "); //argument " "를 넘겨서 초기화
        PyramidConstructor pyramidSpaceZero = new PyramidConstructor("0"); //argument 0을 넘겨서 초기화
        pyramid2.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
    }
}

