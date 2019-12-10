package com.study.demo2;

public class Demo01ArrayA {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] arrayA = new int[10];

        double[] arrayB = new double[10];

        //静态初始化一个数组
        int[] arrayC = new int[]{1, 2, 3, 4};
        String[] arrayD = new String[]{"hello", "world", "zlp"};
        int[] arrayE;
        arrayE =new int[]{1, 2, 3};

        //静态初始化省略格式，不能分开写
        int[] arrayF = {1, 2, 3, 4};


    }
}
