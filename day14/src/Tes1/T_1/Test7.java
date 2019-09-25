package Tes1.T_1;
/*
每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到map集合
中。学生作为键, 家庭住址作为值，并使用keySet和entrySet方式遍历Map集合.注意，学生姓名相同并且年龄相
同视为同一名学生
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        HashMap<Stu3, String> sm = new HashMap<>();
        sm.put(new Stu3("小明", 16), "3号楼");
        sm.put(new Stu3("小李", 16), "4号楼");
        sm.put(new Stu3("小李", 16), "4号楼");
        Set<Stu3> set = sm.keySet();
        for (Stu3 s : set) {
            String value = sm.get(s);
            System.out.println(s + "地方住在" + value);
        }
        Set<Map.Entry<Stu3, String>> entries = sm.entrySet();
        for (Map.Entry<Stu3, String> e : entries) {
            Stu3 key = e.getKey();
            String value = e.getValue();
            System.out.println(key + "地方住在" + value);
        }
    }
}
class Stu3 {
    private String name;
    private int age;

    public Stu3() {
    }

    public Stu3(String name, int age) {
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
        Stu3 student = (Stu3) o;
        return age == student.age && Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return "年龄为：" + age + "的" + name;
    }
}
