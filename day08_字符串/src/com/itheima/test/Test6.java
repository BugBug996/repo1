package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    /*
        需求：键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换

        思路：
        1. 键盘录入一个字符串，用 Scanner 实现
        2. 替换敏感词
                String replace(CharSequence target, CharSequence replacement)
                将当前字符串中的target内容，使用replacement进行替换，返回新的字符串
        3. 输出结果

     */
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        //需求: 将键盘录入的内容中的"TMD","SB"这两个内容都用***进行替换
        // 2. 替换敏感词
        String res = s.replace("TMD","***");
        String res1 = res.replace("SB", "**");
        // 3. 输出结果
        System.out.println("res1 = " + res1);
    }
}
