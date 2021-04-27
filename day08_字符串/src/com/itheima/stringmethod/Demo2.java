package com.itheima.stringmethod;

public class Demo2 {
    public static void main(String[] args) {
        String str = "键盘敲烂,月薪过万";

        //需求1: 将"月薪过万"从str中截取出来
        String res1 = str.substring(5);
        System.out.println("res1 = " + res1);

        //需求2: 将"敲烂"从str中截取出来
        String res2 = str.substring(2, 4);
        System.out.println("res2 = " + res2);
    }
}
