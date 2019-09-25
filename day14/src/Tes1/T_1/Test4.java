package Tes1.T_1;
/*
Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->”张柏
芝”.使用keySet方式迭代出Map集合中的元素
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<>();
        m.put("邓超", "孙俪");
        m.put("李晨", "范冰冰");
        m.put("刘德华", "孙俪");
        m.put("黄晓明", "Baby");
        m.put("谢霆锋", "张柏芝");
        Set<String> set = m.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s+"->"+m.get(s));
        }
    }
}
