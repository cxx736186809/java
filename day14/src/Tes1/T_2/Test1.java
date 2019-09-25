package Tes1.T_2;

import java.util.HashMap;
import java.util.Scanner;

/*
使用键盘录入5个学生信息,录入格式为:”姓名,年龄”.将这5个学生信息存入Map集合中,key是姓名,value是年龄
 */
public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名与年龄（例：姓名，年龄）：");
        for (int i = 0; map.size() < 5; i++) {
            String s = sc.nextLine();
            if (s.indexOf("，") == -1) {
                System.out.println("请按格式重新输入");
                i--;
                continue;
            }
            String name = s.substring(0, s.indexOf("，"));
            String age = s.substring(s.indexOf("，") + 1);
            map.put(name, age);
        }
        System.out.println(map);
    }
}
