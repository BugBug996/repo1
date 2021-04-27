package com.itheima.test;

import java.util.Scanner;

public class Test4_4 {
    /*
        需求：键盘录入一个字符串，统计该字符'海'字出现的次数
     */
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        int count = 0;

        //156****5678   //脱敏处理
        //2. 遍历录入的字符串
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if("海".equals(ch+"")){
                count++;
            }
        }

        System.out.println("count = " + count);


    }
}
