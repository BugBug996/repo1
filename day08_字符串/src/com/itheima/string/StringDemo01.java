package com.itheima.string;

public class StringDemo01 {
    public static void main(String[] args) {
        //1. java.lang包下的类可以直接用,不需要导包
        Object obj = new Object();


        //2. 程序中的""引起来的内容都可以看成是String类的对象
        //"" 字符串常量
        /*
            整数
            小数
            字符
            布尔

            字符串         -- 既可以看成是字符串常量,也可以看成是String类的对象
            null
         */
        int length = "abc".length();            //获取字符串"abc"的长度
        System.out.println("length = " + length);

        //3. 字符串的内容不能改
        String s1 = "bcd";      // s1的内容在运行时不能改,也无法通过String类中的方法进行修改
        s1 = "ccc";

        //s1 += "ac";         // 等价于: s1 = s1 + "ac" : 内存中会产生新的对象,其实是让s1指向了新的内存地址,改的是地址

        System.out.println("s1 = " + s1);

    }
}
