package com.itheima.test;

/*
    关于split方法的坑:
        1. java中有一些特殊符号不能直接split分割
 */
public class Test7_7 {
    public static void main(String[] args) {
        String s = "键盘敲烂.月薪过万";

        // 通过加上\\表示告诉jvm,我后面的.是特殊符号,你帮我特殊处理一下
        String[] sArray = s.split("\\.");
        for (int i = 0; i < sArray.length; i++) {
            System.out.println(sArray[i]);
        }
    }
}
