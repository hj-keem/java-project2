package com.example.javaproject2.week4.day2;

public class PyramidConstructor {
    private String spaceChar = "0"; // <- 공백 문자를 선언할 수 있음
    public PyramidConstructor(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            //System.out.printf("공백 개수: %d  별개수 : %d\n", height - i - 1, 2 * i + 1); //이 부분을 먼저 떠올려야 함.
            System.out.printf("%s %s\n", spaceChar.repeat(height-i-1), "*".repeat(2 * i +1));
        }
    }
    public static void main(String[] args) {
        PyramidConstructor pyramid2 = new PyramidConstructor(" "); //argument " "를 넘겨서 초기화
        PyramidConstructor pyramidSpaceZero = new PyramidConstructor("0"); //argument 0을 넘겨서 초기화
        pyramid2.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
        }
    }

