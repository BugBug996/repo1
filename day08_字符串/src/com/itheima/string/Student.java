package com.itheima.string;

/*
    当一个类没有定义toString方法时，打印这个类的对象，
        打印的就是地址格式：com.itheima.string.Student@1b6d3586

    当我们的类中定义了toString方法时，打印这个类的对象，打印的不是地址值了，
        而是toString()方法的返回值
 */
public class Student {

    public String toString() {
        return "我写了toString方法，就不再输出地址值了";
    }
}

class StudentDemo{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("s = " + s);
    }
}