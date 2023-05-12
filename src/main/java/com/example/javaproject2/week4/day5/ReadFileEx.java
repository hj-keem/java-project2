package com.example.javaproject2.week4.day5;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    //FileReader(x)
    public List<String> getLines(String fileName) throws IOException {
        List<String> linesList = new LinkedList<>();
        //BufferedReader 선언 --> File 연결
        BufferedReader br = new BufferedReader(new FileReader("/Users/kimhyunjung/Desktop/hospital_info_01.csv"));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            linesList.add(line);
        }
        return linesList;
    }
    public Hospital parse(String str){
        System.out.println(str);
        String[] splitted = str.split(","); //csv 파일은 ,를 이용해 나누기 때문에 ,로 split
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1],splitted[2], address);
        return hospital;
    }
    public List<Hospital> getHospitals(List<String> lines) { //list Stirng을 넘기면 돌아가도록
        List<Hospital> hospitals = new ArrayList<>();
        for(String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }
    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx();
        List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
//        System.out.println(result.get(0)); //첫쨋줄은
//        System.out.println(result.get(1)); //둘쨋줄부터 데이터내용
//        System.out.println(result.get(2));
//        System.out.println("-----------");
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(result.get(i));
//        }
//        rfe.parse(strLines.get(1));
        List<Hospital> parseHospital = rfe.getHospitals(strLines);
//        System.out.println(parseHospital.get(0));

        for (int i = 0; i < parseHospital.size(); i++) {
            Hospital hospital = parseHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteaddr(), hospital.getAddress().getFullAddr());
        }
    }
}
