package com.study.demo1;

public class Demo1MethodSum {
    //定义一个方法，求出0到100的和
    public static void main(String[] args) {
        int re = getSum();
        System.out.println(re);
    }
    public static int getSum(){
        int reult =0;
        for (int i = 0; i < 100; i++) {
            reult += i;
        }
        return reult;
    }
}
