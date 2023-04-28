package com.green.java.ch02;

public class StringQuiz1 {
    public static void main(String[] args) {
        String fullFileNm = "newjeans.poster.old.jpg";
        String fileNm, ext;

        int idx = fullFileNm.lastIndexOf(".");
        System.out.println(idx);


        fileNm = fullFileNm.substring(0,idx);
        System.out.println("fileNm : " + fileNm);

        ext = fullFileNm.substring(idx + 1);
        System.out.println("ext : " + ext);
    }
}
