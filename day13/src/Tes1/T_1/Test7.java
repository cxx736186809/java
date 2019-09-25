package Tes1.T_1;
/*
定义人类,包含姓名和年龄属性.创建4个人存储到HashSet中.姓名和年龄相同的人只存储一个。
 */

import java.util.HashSet;
import java.util.Objects;

public class Test7 {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        Person p1=new Person("小雨",26);
        hs.add(new Person("小明",25));
        hs.add(new Person("小李",30));
        hs.add(new Person("小雨",26));
        hs.add(p1);

        for (Person p : hs) {
            System.out.println(p);
        }
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
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
        Person person= (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return name+"\t"+age;
    }

}