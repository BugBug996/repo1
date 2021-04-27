package com.itheima.test;


import java.util.Random;
import java.util.Scanner;

/*
    需求: 通过所学技术,使用程序生成一个随机验证码, 并且将其打印到控制台,然后让用户键盘录入一个验证码,和其对比,效果如下:
    系统生成验证码: As7G
    请输入验证码:
    as7g
    验证通过....
    ------------------------------------
    系统生成验证码: As7G
    请输入验证码:
    abcd
    验证码错误...
 */
public class Test11 {
    public static void main(String[] args) {
        // 1. 拼接一个超大字符串,包含:[A-Z,a-z,0-9]
        String str = new String();
        for (char i = 'a', j = 'A'; i <= 'z' && j <= 'Z'; i++, j++) {
            str += i;
            str += j;
        }
        str += "0123456789";

        //2. 通过Random生成四个大字符串的随机索引    -- [0,str.length() - 1]
        Random r = new Random();

        //4. 定义一个字符串,用来充当最后的验证码
        String verifyCode = new String();

        for (int i = 1; i <= 4; i++) {
            int index = r.nextInt(str.length());
            char ch = str.charAt(index);
            //3. 通过charAt()获取指定随机索引位置对应的字符,拼接成一个新的字符串,这个新的字符串就是我们要的验证码字符串
            verifyCode += ch;
        }

        System.out.println("系统生成验证码: " + verifyCode);

        // 5. 键盘录入验证码   -- 把用户输入的验证码拿到
        Scanner sc = new Scanner(System.in);
        String code = sc.next();

        //6. 比较用户录入的验证码和系统生成的验证码是否匹配   -- 忽略大小写比较
        if (verifyCode.equalsIgnoreCase(code)){
            System.out.println("验证通过....");
        }else {
            System.out.println("验证码错误...");
        }


    }
}
