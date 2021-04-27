package com.itheima.string.mst;

public class StringDemo {
    public static void main(String[] args) {
        //1. 都在常量池中的比较
        String s1 = "abc";
        String s11 = "abc";
        System.out.println(s1 == s11);  // true, 同一个字符串常量"abc"在常量池里只有一份

        //2. 都在堆空间的比较
        String s2 = new String("abc");
        String s22 = new String("abc");
        System.out.println(s2 == s22);  // false. 因为每次new产生的地址都不一样

        //3. 堆空间和常量池的比较
        String s3 = "abc";
        String s33 = new String("abc");
        System.out.println(s3 == s33);   // false. 双引号直接赋值指向常量池,new指向堆空间.

        //4. 字符串变量参与+操作时的比较
        String s4 = "abc";
        String s43 = "ab";
        String s44 = s43 + "c";  // 变量 + 常量 等同于 new
        String s444 = s43 + "c";
        System.out.println(s4 == s44);   // false
        System.out.println(s444 == s44); // false , +一次等于new一次

        //5. 字符串常量参与+操作时的比较
        String s5 = "abc";
        String s55 = "a" + "b"+ "c";  // 常量优化机制: 编译器完成拼接.}
        System.out.println(s5 == s55);  //true
    }
}
