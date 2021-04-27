package com.itheima.api;

import java.util.Scanner;

public class Demo2Scanner {
    /*
        nextXxx和nextLine方法配合使用的时候, nextLine方法就没有键盘录入的机会了

        建议: 今后键盘录入数据的时候, 如果是字符串和其他数一起接受, 建议使用next方法接受字符串.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串2:");
        String s = sc.nextLine();   //无效,因为上面有其他nextXxx方法
        System.out.println("请输入小数:");
        double num = sc.nextDouble(); // 10



        System.out.println(num);
        System.out.println(s);
    }
}
