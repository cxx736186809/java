package Tes1.T_1;
/*
每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到map集合
中。学生作为键, 家庭住址作为值，并使用keySet和entrySet方式遍历Map集合.注意，学生姓名相同并且年龄相
同视为同一名学生
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("邓超1", "孙俪");
        map1.put("李晨1", "范冰冰");
        map1.put("刘德华1", "孙俪");
        map1.put("黄晓明1", "Baby");
        map1.put("谢霆锋1", "张柏芝");
        Set<Map.Entry<String, String>> entries = map1.entrySet();
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//// 创建Map集合对象
//        HashMap<String, String> map = new HashMap<String, String>();
//// 添加元素到集合
//        map.put("胡歌", "霍建华");
//        map.put("郭德纲", "于谦");
//        map.put("薛之谦", "大张伟");
//// 获取 所有的 entry对象 entrySet
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//// 遍历得到每一个entry对象
//        for (Map.Entry<String, String> entry : entrySet) {
//// 解析
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + "的CP是:" + value);
    }
}

