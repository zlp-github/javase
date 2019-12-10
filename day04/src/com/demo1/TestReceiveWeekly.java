package com.demo1;

import java.io.*;

public class TestReceiveWeekly {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\51967\\IdeaProjects\\javase\\day04\\src\\com\\a.txt";
        File file = new File(filePath);
        //读成字节
        FileInputStream fileInputStream = new FileInputStream(file);
        //将字节流转换成字符流
        Reader reader = new InputStreamReader(fileInputStream);
        char[] b = new char[100];
        int lem = reader.read(b);
        if(lem < 0){
            System.out.println("周记还没有接收到");
        }
        System.out.println(new String(b, 0, lem));
        reader.close();
    }
}
