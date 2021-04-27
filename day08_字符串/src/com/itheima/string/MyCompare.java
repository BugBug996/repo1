package com.itheima.string;

/*
    == 比较问题:
        比较基本数据类型时,比较的是具体值
        比较引用数据类型时,比较的是地址值
 */
public class MyCompare {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a == b);

        String s1 = "abc";      //指向常量池
        String s2 = new String("abc");  //指向堆空间
        System.out.println(s1 == s2);
    }
}
