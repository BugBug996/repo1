package com.itheima.homework.day07.homework05;

/*
定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。
行为：工作work()定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()

要求：
    1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法​
    2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)​
    3.调用成员方法,打印格式如下:
        工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
        工号为135基本工资为10000的程序员正在努力的写着代码......
 */
//项目经理类
class Manager{
    //属性：姓名name，工号id，工资salary，奖金bonus。
    private String name;
    private String id;
    private int salary;
    private int bonus;

    //工作work()
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

    public Manager() {
    }

    public Manager(String name, String id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

//程序员类
class Coder{
    //属性：姓名name，工号id，工资salary，奖金bonus。
    private String name;
    private String id;
    private int salary;

    //工作work()
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员"+name+"正在努力的写着代码......");
    }

    public Coder() {
    }

    public Coder(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
           }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

   }
//测试类
public class Homework05 {
    public static void main(String[] args) {
        //1. 创建该类的对象并给属性赋值
        Manager m = new Manager("张三","123",15000,6000);
        Coder c = new Coder("李四","135",10000);

        //2. 指挥对象干活
        m.work();
        c.work();
    }

}
