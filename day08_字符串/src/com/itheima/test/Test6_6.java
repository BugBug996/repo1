package com.itheima.test;

import java.util.Scanner;

public class Test6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String str = sc.nextLine();  //"这TMD真是个人才,我TM真是SB了"

        //定义一个字符串,接收最终的脱敏结果
        String res = str;           //res = "这TMD真是个人才,我TM真是SB了"
        //思考: 如果我有很多的敏感词都需要替换, 该怎么做? 例如敏感词有: TMD, tmd, SB, sb,Sb,TM ...
        //设计一个敏感词库
        String[] msg = {"TMD","tmd","TmD","SB","TM","sb"};

        for (int i = 0; i < msg.length; i++) {
            String code = msg[i];
            res = res.replace(code, "**");   // res = "这**真是个人才,我**真是**了"
        }

        System.out.println("res = " + res);
    }
}
