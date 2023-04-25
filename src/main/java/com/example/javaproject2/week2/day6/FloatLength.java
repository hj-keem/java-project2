package com.example.javaproject2.week2.day6;

public class FloatLength {
    public static void main(String[] args) {
        float f1 = 3.141592f;
       //  float f2 = 3.141592; //f를 붙이지 않으면 빨간 줄 뜨고 에러남
        float f3 = 23;
        double d1 = 3.141592653589793;
        System.out.println(f1); // 3.141592
        System.out.println(d1); // 3.141592653589793

        // f3에 소수를 넣지 않고 정수를 넣었을 때 어떻게 출력되는지
        System.out.printf("%f\n",f3);
        System.out.println(f3);
    }
}
