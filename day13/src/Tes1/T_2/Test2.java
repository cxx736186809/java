package Tes1.T_2;
/*
向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫删除,添加王小丫
 */

import java.util.Collections;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        Collections.addAll(hs,"张三","李四","王五","二丫","钱六","孙七");
        System.out.println(hs);
        hs.remove("二丫");
        System.out.println(hs);
        hs.add("王小丫");
        System.out.println(hs);
    }
}
