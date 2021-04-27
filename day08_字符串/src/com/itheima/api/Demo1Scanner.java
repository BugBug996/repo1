package com.itheima.api;

import java.util.Scanner;

public class Demo1Scanner {
    /*
        1. 如果键盘只录入字符串,不录别的,那可以用nextLine,用nextLine就别用其他nextXxx方法了
                nextLine的上方不能有其他nextXxx方法, 下面是可以写其他方法的
        2. 如果使用next接收字符串, 只要录入的字符串中没有空格,这哥们就非常好使        -- 推荐使用
     */
    public static void main(String[] args) {
        // 1. 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        double dd = sc.nextDouble();
        System.out.println("dd = " + dd);

        System.out.println("请输入第一个字符串:");
        // 2. 调用nextLine方法接收字符串
        // ctrl + alt + v : 快速生成方法的返回值
        String s = sc.next();

        /*System.out.println("请输入第二个字符串:");
        // 2. 调用nextLine方法接收字符串
        // ctrl + alt + v : 快速生成方法的返回值
        String s1 = sc.nextLine();*/

        System.out.println(s);
        //System.out.println("s1 = " + s1);
    }
}
