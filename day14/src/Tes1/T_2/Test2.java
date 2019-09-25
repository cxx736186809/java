package Tes1.T_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
研发部门有5个人，信息如下：（姓名-工资）【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败
=3800】,将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台
 */
public class Test2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("柳岩",2100);
        hashMap.put("张亮",1700);
        hashMap.put("诸葛亮",1800);
        hashMap.put("灭绝师太",2600);
        hashMap.put("东方不败",3800);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        hashMap.put("柳岩",hashMap.get("柳岩")+300);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
