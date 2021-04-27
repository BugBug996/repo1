package com.itheima.homework.day08;

import java.util.Random;
import java.util.Scanner;

/*
    生成的验证码为：BkhD
    请输入验证码
    abcd
    输入错误，请重新输入...
    生成的验证码为：n1wX
    请输入验证码
    aaaa
    输入错误，请重新输入...
    生成的验证码为：Fm1a
    请输入验证码
    fm1a
    输入正确
 */
public class Homework09 {
    public static void main(String[] args) {
        // 1. 拼接一个超大字符串,包含:[A-Z,a-z,0-9]
        StringBuilder str = new StringBuilder("0123456789");
        for (char i = 'a', j = 'A'; i <= 'z' && j <= 'Z'; i++, j++) {
            str.append(i).append(j) ;
        }
        //2. 通过Random生成四个大字符串的随机索引    -- [0,str.length() - 1]
        Random r = new Random();
        //4. 定义一个字符串,用来充当最后的验证码
        while (true) {
            String verifyCode = new String();
            for (int i = 1; i <= 4; i++) {
                int index = r.nextInt(str.length());
                char ch = str.toString().charAt(index);
                //3. 通过charAt()获取指定随机索引位置对应的字符,拼接成一个新的字符串,这个新的字符串就是我们要的验证码字符串
                verifyCode += ch;
            }
            System.out.println("系统生成验证码: " + verifyCode);

            // 5. 键盘录入验证码   -- 把用户输入的验证码拿到
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入验证码");
            String code = sc.next();

            //6. 比较用户录入的验证码和系统生成的验证码是否匹配   -- 忽略大小写比较
            if (verifyCode.equalsIgnoreCase(code)) {
                System.out.println("输入正确");
                //结束循环
                break;
            } else {
                System.out.println("输入错误，请重新输入...");
            }
        }

    }
}
