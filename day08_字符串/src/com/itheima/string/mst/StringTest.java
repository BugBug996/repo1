package com.itheima.string.mst;

/*
    字符串比较的常见面试题, 四种情况
 */
public class StringTest {
    public static void main(String[] args) {
        //1. 字符串对象直接由""赋值方式产生,内容相同,则地址相同
        String s1 = "abc";      // String s1 = 0x111
        String s2 = "abc";      // String s2 = 0x111
        System.out.println(s1 == s2);   //true

        //2. 直接""赋值的字符串和new出来的字符串比,不管什么情况,都是false
        String s3 = "abc";      //指向常量池  s3 = 0x111
        String s4 = new String("abc");  //指向堆空间, s4 = 0x222
        System.out.println(s3 == s4);       //false


        /*
            字符串的+操作
                1. 变量 + 常量      // 存在堆空间,可以理解为一次new
                2. 变量 + 变量      // 存在堆空间, 可以理解为一次new
                3. 常量 + 常量      // 存在常量优化机制,jvm会在编译时完成拼接,存在常量池
         */
        String s5 = "ab";
        String s6 = s5 + "c";   //变量 + 常量      // 存在堆空间

        String s7 = "abc";      //指向常量池
        System.out.println(s7 == s6);       //false

        String s8 = "c";
        String s9 = s5 + s8;        // 变量 + 常量  // 存在堆空间
        System.out.println(s7 == s9);    // false
        System.out.println(s9 == s6);    //false

        String s10 = "a" + "b" + "c";       //常量 + 常量,存在常量优化机制,jvm会在编译时完成拼接,存在常量池
        System.out.println(s7 == s10);  //true
    }
}
