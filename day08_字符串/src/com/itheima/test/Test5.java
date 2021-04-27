package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    /*
        需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
        最终效果为：156****1234
        思路：
        1. 键盘录入一个字符串，用 Scanner 实现
        2. 截取字符串前三位
        3. 截取字符串后四位
        4. 将截取后的两个字符串，中间加上****进行拼接，输出结果
     */
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号:");          // 138 JPKA 8948
        String telString = sc.nextLine();
        // 2. 截取字符串前三位
        String start = telString.substring(0,3); // 从0索引位置开始截取,截取到3索引位置,包含0索引,不包含3索引.含头不含尾
        // 3. 截取字符串后四位
//        String end = telString.substring(telString.length() - 4);
        String end = telString.substring(7);

        // 4. 将截取后的两个字符串，中间加上****进行拼接，输出结果
        System.out.println(start + "****" + end);           // 手机号脱敏处理
    }
}
