package Tes1.T_2;

import java.util.*;

/*
键盘录入语句英语,统计每个单词出现的次数。
1. 录入格式如：If you wantto change your fate I think you must come to the dark horse to learnjava (用空
格间隔)
2. 打印格式如：
to=3
think=1
you=2
…
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println("请输入一句英语语句：");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int index=str.indexOf(" ");
            String s=str.substring(0,index);

            if (!hashMap.containsKey(s))
                hashMap.put(s,1);
            else
                hashMap.put(s,hashMap.get(s)+1);
            str=str.substring(index+1);
            System.out.println(str);
        }
        System.out.println(hashMap);
    }
}