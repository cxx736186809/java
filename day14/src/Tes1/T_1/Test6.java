package Tes1.T_1;
/*
每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到Map集合
中。家庭住址作为键, 学生作为值。并使用keySet和entrySet方式遍历Map集合
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        HashMap<String, Stu2> sm = new HashMap<>();
        sm.put("1号楼", new Stu2("小明", 16));
        sm.put("2号楼", new Stu2("小李", 16));
        Set<String> set = sm.keySet();
        for (String s : set) {
            Stu2 value = sm.get(s);
            System.out.println(s + "地方住着" + value);
        }
        Set<Map.Entry<String, Stu2>> entries = sm.entrySet();
        for (Map.Entry<String, Stu2> e:entries) {
            String key = e.getKey();
            Stu2 value = e.getValue();
            System.out.println(key + "地方住着" + value);
        }
    }
}

class Stu2 {
    private String name;
    private int age;

    public Stu2() {
    }

    public Stu2(String name, int age) {
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
        return  "年龄为：" + age + "的"+name;
    }
}