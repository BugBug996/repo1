package com.itheima.homework.day07.homework06;
//定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
public class Cat {
    private String color;
    private String breed;

    public void eat(){
        System.out.println(color+"的"+breed+"猫正在吃鱼.....");
    }
    public void catchMouse(){
        System.out.println(color+"的"+breed+"猫正在逮老鼠....");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
}
