package com.itheima.homework.day08;

/*
在String类的API中，有如下两个方法：
    // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
    public int indexOf(String str)

    // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
    public String substring(int beginIndex)

请仔细阅读API中这两个方法的解释，完成如下需求。
    现有如下文本：
        "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
    请编写程序，统计该文本中"Java"一词出现的次数。
 */
public class Homework10 {
    public static void main(String[] args) {
        //1. 定义一个字符串,用来管理文本数据
        String s = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int count = 0;

        while (s.contains("Java")) {
            //2. 获取Java在整个大的字符串中的索引位置
            int index = s.indexOf("Java");      // 0
            if (index >= 0) {
                //2.1 说明在当前字符串s中,确实存在Java,这时候我们把计数器+1
                count++;
                //2.2 通过subString方法,对s进行截取:
                s = s.substring(index + "Java".length());  // s = s.substring(4);
                System.out.println("s = " + s);
            }else {
                //3. 说明剩下的字符串中没有Java了,这时候循环就可以停了
                break;
            }
        }
        System.out.println("count = " + count);
    }
}
