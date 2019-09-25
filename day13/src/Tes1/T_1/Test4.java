package Tes1.T_1;
/*
练习LinkedList基本方法: add, set, get, remove, clear, size方法
 */

import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.add("后来");
        link.add("生如夏花");
        System.out.println(link);
        link.addFirst("平凡之路");
        System.out.println(link);
        link.addLast("过火");
        System.out.println(link);
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        link.removeFirst();
        System.out.println(link);
        link.removeLast();
        System.out.println(link);
    }
}