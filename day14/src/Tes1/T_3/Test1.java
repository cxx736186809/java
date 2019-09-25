package Tes1.T_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap嵌套HashMap
小米科技包含2个班级：Java基础班，Java就业班
Java基础班
 001 李晨
 002 范冰冰
Java就业班
 001 马云
 002 马化腾
使用HashMap集合存储以上班级的学生信息，并完成以下两个需求
1. 使用keySet和增强for遍历出里面的元素
2. 使用entrySet和迭代器遍历出里面的元素
 */
public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<HashMap, String> hashMap = new HashMap<>();

        map1.put("001 李晨", "Java基础班");
        map1.put("002 范冰冰", "Java基础班");
        map2.put("001 马云", "Java就业班");
        map2.put("002 马化腾", "Java就业班");
        hashMap.put(map1, "小米科技");
        hashMap.put(map2, "小米科技");
        Set<HashMap> set = hashMap.keySet();
        for (HashMap s : set) {
            String hs = hashMap.get(s);
            System.out.println(s + hs);
        }
        Set<Map.Entry<HashMap, String>> entries = hashMap.entrySet();
        for (Map.Entry<HashMap, String> s : entries) {
            System.out.println(s.getKey() + s.getValue());
        }
    }

}
