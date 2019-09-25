package Tes1.T_1;
/*
定义一个方法add接收0个及以上的String类型数据,这个方法的作用是将传入的String类型的参数放入一个ArrayList
中,并返回这个ArrayList集合
 */

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = add("1", "das", "da", "45", "ds");
        for (String s : arrayList)
            System.out.println(s);
    }

    public static ArrayList add(String... str) {
        ArrayList<String> arr = new ArrayList<>();
        for (String s : str)
            arr.add(s);
        return arr;
    }
}
