package com.itheima.api;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 键盘录入一个整数
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        System.out.println("num = " + num);

        //1. 键盘录入一个字符串
        System.out.println("请输入一个字符串:");
        //结论: 以后接字符串就用next!!!
        String str = sc.next();
        //String str = sc.nextLine();
        System.out.println("str = " + str);

    }
}
