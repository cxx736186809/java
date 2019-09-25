package Tes1.T_2;
/*
有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};创建一个ArrayList，将数组里面的元素添加进
ArrayList，但元素不能重复(使用HashSet去除重复元素)
 */

import java.util.ArrayList;
import java.util.HashSet;


public class Test5 {
    public static void main(String[] args) {
        String[] arr = {"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for (String s : arr) {
            hs.add(s);
        }
        list.addAll(hs);
        System.out.println(list);
    }
}