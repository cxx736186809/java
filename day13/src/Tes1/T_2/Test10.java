package Tes1.T_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/*
自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.创建5个学生放到
HashSet中(姓名和年龄相同的认为是同一学生).使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输
出
 */
public class Test10 {
    public static void main(String[] args) {
        double num=0;
        double max=0;
        double min=100;
        int scout=0;
        Student1 s1 = new Student1("小明", 18, 78);
        Student1 s2 = new Student1("小红", 16, 80);
        Student1 s3 = new Student1("小李", 17, 90);
        Student1 s4 = new Student1("小刚", 19, 60);
        Student1 s5 = new Student1("小明", 18, 100);
        HashSet<Student1> s = new HashSet<>();
        Collections.addAll(s, s1, s2, s3, s4, s5);
        Iterator<Student1> it = s.iterator();
        while (it.hasNext()){
            Student1 student1=it.next();
            num+=student1.getGrade();
            scout++;
            if(student1.getGrade()>max)
                max=student1.getGrade();
            if (student1.getGrade()<min)
                min=student1.getGrade();
        }
        System.out.println(num);
        System.out.println(num/scout);
        System.out.println(max);
        System.out.println(min);

    }
}

class Student1 {
    private String name;
    private int age;
    private double grade;

    public Student1() {
    }

    public Student1(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student1 student = (Student1) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

