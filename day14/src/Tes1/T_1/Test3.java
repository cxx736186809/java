package Tes1.T_1;
/*
往一个Map集合中添加若干元素.获取Map中的所有value, 并使用增强for和迭代器遍历输出每个value
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "sdaadadadadad");
        map.put(5, "sdasdadasdadasad");
        map.put(6, "sdaddadaaddaddsada");
        Collection<String> values = map.values();
        for (String i : values) {
            System.out.println(i);
        }
        System.out.println("====================");
        Iterator<String> it = values.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
