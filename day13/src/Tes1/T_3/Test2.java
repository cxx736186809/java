package Tes1.T_3;

import java.util.Collections;
import java.util.HashSet;

/*
一个学科中有若干班级，每一个班级又有若干学生。整个学科一个大集合，若干个班级分为每一个小集合(集合嵌
套之HashSet嵌套HashSet)。要求如下
1、 学生类有两个属性，姓名和年龄，并定义有参构造、无参构造和getter/setter方法.姓名和年龄相同的视为同一
学生
2、向班级集合中添加若干个学生（至少两个学生）。
2、向学科集合中添加所有班级(至少创建两个班级)。
3、使用两种方法遍历学科集合，并打印出所有学生。
 */
public class Test2 {
    public static void main(String[] args) {
        Stu s1 = new Stu("小明",16);
        Stu s2 = new Stu("小红",16);
        Stu s3 = new Stu("小刚",16);
        Stu s4 = new Stu("小明",16);
        Stu s5 = new Stu("小红",16);
        Stu s6 = new Stu("小刚",16);
        Stu s7 = new Stu("小明",16);
        HashSet<Stu> c1 = new HashSet<>();
        HashSet<Stu> c2 = new HashSet<>();

        HashSet<HashSet> subject = new HashSet<>();
        Collections.addAll(c1,s1,s2,s3);
        Collections.addAll(c2,s4,s5,s6);
        Collections.addAll(subject,c1,c2);
        for(HashSet s:subject)
            System.out.println(s);
    }
}
class Stu{
    private String name;
    private int age;

    public Stu() {
    }

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "{" +"name='" + name + '\'' +", age=" + age +'}';
    }
}
