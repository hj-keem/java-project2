package com.example.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x=0; // 빨간줄 뜨고 접근이 안 되고 있음
        p1.y=1;
        System.out.printf("x : %d, y : %d\n", p1.x, p1.y);


        //또 다른 점 찍기
        Point p2 = new Point();
        p2.x=1;
        p2.y=1;
        System.out.printf("x : %d, y : %d\n", p2.x, p2.y);

        //또 다른 점 찍기
        Point p3 = new Point();
        p3.x=2;
        p3.y=2;
        System.out.printf("x y가 같은지? %s\n", p3.isSameXy());


    }
}
