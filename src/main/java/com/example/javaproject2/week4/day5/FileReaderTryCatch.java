//package com.example.javaproject2.week4.day5;
//
//import com.example.javaproject2.week4.day5.ReadFileEx;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.LinkedList;
//import java.util.List;
//
//public class FileReaderTryCatch {
//    public List<String> getLines(String fileName) {
//        List<String> lines = new LinkedList<>();
//
//        try(BufferedReader br = Files.newBufferedReader(
//                Paths.get("./hospital_info.csv"), StandardCharsets.UTF_8)){
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                lines.add(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return lines;
//    }
//    public static void main(String[] args) throws IOException {
//        ReadFileEx rfe = new ReadFileEx();
//        List<String> result = rfe.getLines("/Users/kimhyunjung/Desktop/hospital_info_0920_utf8.csv");
//        System.out.println(result.get(0));
//
//    }
//
//}
//
