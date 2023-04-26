package com.example.javaproject2.week2.day8;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount = likeCount + 1;
        System.out.println(likeCount);

        likeCount = likeCount+1; // 좋아요 한번 더
        System.out.println(likeCount);

        likeCount = likeCount - 1; //좋아요 취소
        System.out.println(likeCount);
    }
}
