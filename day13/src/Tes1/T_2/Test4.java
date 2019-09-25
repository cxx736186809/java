package Tes1.T_2;
/*
定义一个Student类,包含名称,年龄,性别(姓名,年龄,性别完全相同视为同一学生)
创建10个Student对象,至少有两个学生姓名,年龄,性别完全相同. 把这10个学生添加到Set集合中,不可以重复,遍历
Set集合打印学生信息,使用两种方式
 */

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Test4 {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 16, "男");
        Student s2 = new Student("小红", 17, "女");
        Student s3 = new Student("小李", 18, "男");
        Student s4 = new Student("小机", 19, "女");
        Student s5 = new Student("小方", 20, "女");
        Student s6 = new Student("小刚", 21, "男");
        Student s7 = new Student("小豆", 22, "女");
        Student s8 = new Student("小黄", 23, "男");
        Student s9 = new Student("小明", 16, "男");
        Student s10 = new Student("小修", 16, "女");
        HashSet<Student> hs = new HashSet<>();
        Collections.addAll(hs, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        Iterator<Student> is = hs.iterator();
        while (is.hasNext())
            System.out.println(is.next());
        for (Student s : hs) {
            System.out.println(s);
        }

    }
}

class Student {
    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" + name + "\t" + age + "\t" + sex + '}';
    }
}