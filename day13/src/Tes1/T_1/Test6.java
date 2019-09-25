package Tes1.T_1;
/*
hashCode和equals方法
 */

import java.util.HashSet;
import java.util.Objects;

public class Test6 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student stu = new Student("于谦", 43);
        hs.add(stu);
        hs.add(new Student("郭德纲", 44));
        hs.add(new Student("于谦", 43));
        hs.add(new Student("郭麒麟", 23));
        hs.add(stu);
        for (Student s : hs) {
            System.out.println(s);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student[name=" + name + ",age=" + age + ']';
    }
}