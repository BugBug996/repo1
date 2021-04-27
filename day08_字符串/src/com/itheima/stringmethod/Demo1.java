package com.itheima.stringmethod;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "迪丽热巴";

        //遍历s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.println(ch);
        }

        System.out.println("-----------");

        String s2 = "马尔扎哈";
        //遍历s2
        //1. 先把s2转成字符数组
        char[] array = s2.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
