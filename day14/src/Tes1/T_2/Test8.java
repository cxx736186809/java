package Tes1.T_2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
通过键盘录入五个人的姓名,每当录入一个人的姓名,随机给出一个成绩0, 100.
将姓名和成绩存储到Map集合中,姓名作为key,成绩作为value
统计五个学生的总分,最高分,最低分,平均分,并将总分,最高分,最低分,平均分
将结果输出到控制台格式为: 总分=xxx,最高分=xxx,最低分=xxx,平均分=xxx
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个姓名：");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; 5 > hashMap.size(); i++) {
            String s = sc.nextLine();
            hashMap.put(s, (int) (0+Math.random()*100));
        }
        Integer num=0;
        Integer max=0;
        Integer min=100;
        Set<String> set = hashMap.keySet();
        for (String s:set){
            num+=hashMap.get(s);
        if (hashMap.get(s)>max)
            max=hashMap.get(s);
        if (hashMap.get(s)<min)
            min=hashMap.get(s);
        }
        System.out.println("总分="+num+"，平均分="+num/5+"，最高分="+max+"，最低分="+min);
    }
}