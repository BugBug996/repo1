package com.itheima.homework.day08;

import java.util.Scanner;

/*
    我国的居民身份证号码，由十七位数字本体码和一位数字校验码组成。
    请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
    规则为：
        1. 号码为18位
        2. 不能以数字0开头
        3. 前17位只可以是数字
        4. 最后一位可以是数字或者大写字母X。
 */
public class Homework08 {

    public static void main(String[] args) {
        //1. 键盘录入一个身份证
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号码");
        String idCard = sc.nextLine();

        boolean flag = idCard.matches("^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");

        System.out.println("flag = " + flag);
      /*  //2. 调用checkIdCard校验录入的身份证是否合法
        boolean flag = checkIdCard(idCard);
        if (flag){
            System.out.println("身份证合法");
        }else {
            System.out.println("身份证格式错误!");
        }*/
    }

    /*
        功能: 判断用户输入的身份证号码是否合法
        条件: 应该把身份证号码给我   -- String idCard
        结果: 返回true/false  -- boolean
     */
    public static boolean checkIdCard(String idCard){
        //1. 号码为18位
        if (idCard.length() != 18){
            return false;
        }
        //2. 不能以数字0开头
        if (idCard.startsWith("0")){
            return false;
        }
        char[] chs = idCard.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (i ==  chs.length - 1){
                //4. 最后一位可以是数字或者大写字母X。
                if ((chs[i] < '0'|| chs[i] > '9')&& chs[i] != 'X'){
                    return false;
                }
            }else {
                //3. 前17位只可以是数字
                if (chs[i] < '0'|| chs[i] > '9' ){
                    return false;
                }
            }
        }
        // 能执行到这儿,说明上述所有规则都圆满通过
        return true;
    }
}
