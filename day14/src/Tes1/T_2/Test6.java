package Tes1.T_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
定义一个List集合,泛型为String类型。统计整个集合中所有字符（注意，不是字符串）的个数。例如:集合中
有”abc”、”bcd”两个元素,程序最终输出结果为:“a = 1,b = 2,c = 2,d = 1”
 */
public class Test6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "bcd");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            char[] chars = s.toCharArray();
            for (Character c : chars) {
                if (!map.containsKey(c))
                    map.put(c, 1);
                else
                    map.put(c, map.get(c) + 1);
            }
        }
        System.out.println(map);
    }
}