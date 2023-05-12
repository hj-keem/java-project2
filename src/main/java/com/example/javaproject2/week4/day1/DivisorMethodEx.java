package com.example.javaproject2.week4.day1;
public class DivisorMethodEx {
    int sumOfFactors(int num){
        int answer=1;
        for(int i=2; i<=num; i++){
           if(num % i == 0) answer += i;
           }
        return answer;
    }
    void printResult(int num){
        System.out.printf("%d의 약수의 합은 %d 입니다.\n", num, sumOfFactors(num));
    }
    public static void main(String[] args) {
        DivisorMethodEx divisorMethodEx = new DivisorMethodEx();
        divisorMethodEx.printResult(12);
        divisorMethodEx.printResult(36);
        divisorMethodEx.printResult(48);
        divisorMethodEx.printResult(29);
    }

}
