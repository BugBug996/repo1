package com.itheima.homework.day07.homework04;

/*
定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
另外定义一个用于展示三个属性值的show()方法。
请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：

    我女朋友叫凤姐,身高155.0厘米,体重130.0斤
    女朋友帮我洗衣服
    女朋友给我做饭
 */
class GirlFriend {
    private String name;
    private double height;
    private double weight;

    public GirlFriend() {
    }

    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //洗衣服wash()，做饭cook()。
    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友给我做饭");
    }

    public void show() {
        System.out.println("我女朋友叫" + name + ",身高" + height + "厘米,体重" + weight + "斤");
    }

}

public class Homework04 {
    public static void main(String[] args) {
        //1. 通过有参构造方法创建对象并赋值
        GirlFriend gf = new GirlFriend("岩岩",168.0,168.0);

        //2. 分别调用展示方法、洗衣服方法和做饭方法
        gf.show();
        gf.wash();
        gf.cook();
    }
}
