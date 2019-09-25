package Tes1.T_1;
/*
练习LinkedList基本方法: add, set, get, remove, clear, size方法
 */

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("海阔天空");
        link.add("光辉岁月");
        link.add("你瞒我瞒");
        System.out.println(link);
        link.add(2, "青花瓷");
        System.out.println(link);
        link.set(2, "稻香");
        System.out.println(link);
        link.get(0);
        System.out.println(link);
        System.out.println(link.size());
        link.remove(2);
        System.out.println(link);
        link.clear();
        System.out.println(link);
    }
}