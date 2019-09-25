package T_1;

import java.util.*;
/*
使用lambda表达式对List，Set，Map集合进行遍历。
 */
public class Test9 {
    public static void main(String[] args) {
        List list = new LinkedList<>();
        list.add("ads");
        list.add("dasda");
        list.add("dewqeqweq");
        list.forEach((list1) -> System.out.println(list1 + "  "));
        System.out.println("==============================");
        HashSet set = new HashSet<>();
        Collections.addAll(set, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        set.forEach((set1) -> System.out.println(set1 + "   "));
        System.out.println("==============================");
        Map map = new HashMap();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.forEach((k, v) -> System.out.println("map : " + k + " Count : " + v));
    }
}
