package Tes1.T_1;
/*
往一个Map集合中添加若干元素.获取Map中的所有key, 并使用增强for和迭代器遍历输出每个key
 */
import java.util.HashMap;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"sdad");
        map.put(2,"sdasdad");
        map.put(3,"sdaddsada");
        Set<Integer> key=map.keySet();
        for (Integer i:key){
            String value = map.get(i);
            System.out.println(i+"是："+value);
        }
    }
}
