package Tes1.T_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
使用键盘循环录入：书名,价格
创建一个Map集合，key存储书名，value存储书的价格. 录入以下5本书数据:
{Java=32.5,C++=25,PHP=28.6,UI=21.3,Python=10.2}
要求：
1. 删除集合中的C++这本书
2. Java的这本书涨价为38.5元
3. 使用keySet和entrySet两种不同方式对集合遍历输出
 */
public class Test9 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名与价格（例：书名，价格）：");
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            int index = str.indexOf("，");
            if (index == -1) {
                System.out.println("请按格式重新输入!");
                i--;
                continue;
            }
            String book = str.substring(0, str.indexOf("，"));
            Double price = Double.valueOf(str.substring(str.indexOf("，") + 1));
            map.put(book, price);
        }
        map.remove("C++");
        Set<String> set = map.keySet();
        map.put("java", 38.5);
        for (String s : set) {
            Double value = map.get(s);
//            if (map.containsKey("java"))
//                map.put(s,38.5);
            System.out.println(s + "=" + value);
        }
        System.out.println(map);
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> s1 : entries)
            System.out.println(s1.getKey() + "=" + s1.getValue());

    }
}
