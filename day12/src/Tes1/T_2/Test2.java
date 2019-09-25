package Tes1.T_2;
/*
自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.创建5个人放到
ArrayList中.使用迭代器获取每个人的信息.找出最高的人,最矮的人并输出最高人和最矮人的信息.打印格式如下:最
高的人是张三,身高1.80. 最矮的人是李四,身高1.60
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        double MaxHeight = 0;
        double MinHeight = 2.00;
        String s1 = "";
        String s2 = "";
        Person p1 = new Person("小米", 16, 1.60);
        Person p2 = new Person("小都", 20, 1.72);
        Person p3 = new Person("小七", 30, 1.50);
        Person p4 = new Person("小清", 50, 1.81);
        Person p5 = new Person("小李", 60, 1.90);
        Collection<Person> col = new ArrayList<>();
        col.add(p1);
        col.add(p2);
        col.add(p3);
        col.add(p4);
        col.add(p5);
        Iterator<Person> it = col.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            if (MaxHeight < p.getHeight()) {
                MaxHeight = p.getHeight();
                s1 = p.getName();
            }

            if (MinHeight > p.getHeight()) {
                MinHeight = p.getHeight();
                s2 = p.getName();
            }
        }
        System.out.println("最高的人是：" + s1+",身高：" + MaxHeight);
        System.out.println("最矮的人是：" + s2+",身高：" + MinHeight);
    }
}

class Person {
    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}