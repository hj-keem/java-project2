package com.example.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException { // 호출한 곳으로 에러를 보내겠다
        InputStreamReader is = new InputStreamReader(System.in);

        System.out.println(is.read());

    }

    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        System.out.println(asciiCode1);
        System.out.println(asciiCode2);

    }
}
