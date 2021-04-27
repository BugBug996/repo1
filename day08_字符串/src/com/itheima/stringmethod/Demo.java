package com.itheima.stringmethod;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String s1 = "柳岩";
        String s2 = new String("杨幂");
        //1. 需求: 比较s1和s2的地址值
        System.out.println(s1 == s2);

        //2. 需求: 比较s1和s2的内容
        System.out.println(s1.equals(s2));

        String verifyCode = "Ac1G";
        System.out.println("请输入验证码");
        Scanner sc = new Scanner(System.in);
        String inputVerifyCode = sc.next();

        //忽略大小写匹配
        if (verifyCode.equalsIgnoreCase(inputVerifyCode)){
            System.out.println("验证通过...");
        }else {
            System.out.println("验证码输入有误!");
        }

    }
}
