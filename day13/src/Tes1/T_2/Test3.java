package Tes1.T_2;
/*
向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫删除,添加王小丫
 */

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String s : strs) {
            if (!list.contains(s))
                list.add(s);
        }
        System.out.println(list);
    }
}