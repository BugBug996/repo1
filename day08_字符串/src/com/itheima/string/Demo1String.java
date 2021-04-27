package com.itheima.string;

public class Demo1String {
    /*
        1. Java程序中, 所有的双引号字符串, 都是String这个类的对象

        2. 字符串它们的值(字符内容)在创建之后不能更改

        3. 字符串常量在常量池中被共享使用,同一个字符串常量在常量池中只有一份!
     */
    public static void main(String[] args) {
        //1. 双引号直接引起来的指向常量池
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        int length = s1.length();
        System.out.println("length = " + length);

        s1 = "def";
        System.out.println("s1 = " + s1);








        // "abc"第一次被访问的时候,在常量池里找
        // ,没有,没有就创建出来
        // 后面在访问"abc"时,发现常量池里已经存在了
        // 这时候会直接复用
       /* String s2 = "abc";

        System.out.println(s1 == s2);

        char[] ch = {'a','b','c'};
        String s3 = new String(ch);     // 指向堆内存
        System.out.println(s1 == s3);

        String s4 = new String(ch);     // 指向堆内存
        System.out.println(s3 == s4);

        // 3. 字符串的+操作: 变量 + 常量  直接看成 new,最终指向堆空间
        String s5 = "ab";
        String s6 = s5 + "c";       // 等同于new,每次new都会产生新的堆空间地址
        String s7 = s5 + "c";       // 等同于new
        System.out.println(s1 == s6);
        System.out.println(s7 == s6);

        // 4. 字符串的+操作: 常量 + 常量  存在常量优化机制,会在编译期完成拼接
        String s8 = "ab" + "c";     // 等同于 s8 = "abc";
        System.out.println(s1 == s8);*/
    }

}
