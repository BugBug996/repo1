package com.itheima.test;

/*
    String toLowerCase() : 将当前字符串字母全部转为小写
    String toUpperCase() : 将当前字符串字母全部转为大写

    String trim(): 消除当前字符串的首尾的空格

    boolean contains(String str): 判断当前字符串是否包含指定的内容,包含返回true,不包含就返回false

    boolean startsWith(String str): 判断当前字符串是否以指定内容开头
    boolean endWith(String str):  判断当前字符串是否以指定内容结尾

    int indexOf(String str) : 获取指定内容在当前字符串中第一次出现的索引位置
 */
public class Test12 {
    public static void main(String[] args) {
        String str = "  you can kill me, you can't fuck me   ";
        System.out.println("str = " + str);

        //需求1: 将str对应的所有内容中的小写字母转为大写字母
        String s1 = str.toUpperCase();
        System.out.println("s1 = " + s1);

        //需求2: 将s1中所有字母都转为小写
        String s2 = s1.toLowerCase();
        System.out.println("s2 = " + s2);

        //需求3: 将str前后的空格消除
        String s3 = str.trim();
        System.out.println("s3 =" + s3);

        //需求4: 判断str中是否包含"fuck"
        boolean res1 = str.contains("fuck");
        System.out.println("res1 = " + res1);

        String name = "柳岩杨幂迪丽热巴古力拉扎马尔扎哈";
        //需求5:  判断name是否以"柳"开头
        boolean res2 = name.startsWith("柳");
        System.out.println("res2 = " + res2);

        //需求6: 判断name是否以"哈"结尾
        boolean res3 = name.endsWith("哈");
        System.out.println("res3 = " + res3);

        String msg = "我爱学习,谁都别打扰我,否则我就和你玩游戏";
        //需求7: 获取"我"在msg中第一次出现的索引位置
        int firstIndex = msg.indexOf("我");
        System.out.println("firstIndex = " + firstIndex);

        //需求8: 获取"我"在msg中第二次出现的索引位置
        //String subMsg = msg.substring(firstIndex + 1);
        //System.out.println("subMsg = " + subMsg);
        //int secondIndex = subMsg.indexOf("我");
        //System.out.println("secondIndex = " + (secondIndex + firstIndex + 1));
    }
}
