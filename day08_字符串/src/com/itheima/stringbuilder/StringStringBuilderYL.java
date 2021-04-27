package com.itheima.stringbuilder;

/*
    String和StringBuilder的效率区别:
        1. String的+操作效率低:
            每进行一次+操作,底层就会自动new一个StringBuilder,既耗时,又浪费堆空间内存
        2. StringBuilder的效率高:
            不管进行多少次的append,堆空间只需要一个StringBuilder对象就可以了
 */
public class StringStringBuilderYL {
    public static void main(String[] args) {
        //1. String的+操作效率低
        String s1 = "a";
        String s2 = s1 + "b";
        System.out.println("s2 = " + s2);   //"ab"


        //2. StringBuilder的效率高
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b");
        String s3 = sb.toString();
        System.out.println("s3 = " + s3);   //"ab"
    }

}
