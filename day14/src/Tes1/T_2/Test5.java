package Tes1.T_2;

import java.util.HashMap;
import java.util.Scanner;

/*
键盘录入一个字符串,分别统计出其中英文字母、空格、数字和其它字符的数量,输出结果:”其他=1, 空格=2, 字母
=12, 数字=6”
 */
public class Test5 {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        HashMap<String, Integer> hm1 = new HashMap<>();
        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if ((chars[i] > 'a' && chars[i] < 'z') || (chars[i] > 'A' && chars[i] < 'Z'))
//                a++;
//            else if (chars[i] > '0' && chars[i] < '9')
//                b++;
//            else if (chars[i] == ' ')
//                c++;
//            else
//                d++;
//        }
//        hm1.put("其他", d);
//        hm1.put("空格", c);
//        hm1.put("字母", b);
//        hm1.put("数字", a);
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] > 'a' && chars[i] < 'z' )||( chars[i] > 'A' && chars[i] < 'Z'))
               countingKey(hm1,"字母");
            else if (chars[i] > '0' && chars[i] < '9')
                countingKey(hm1,"数字");
            else if (chars[i] == ' ')
                countingKey(hm1,"空格");
            else
            countingKey(hm1,"其它");
        }
        System.out.println(hm1);
    }
    public static void countingKey(HashMap<String,Integer> map,String key){
        if (map.get(key)==null)
            map.put(key,1);
        else {
            map.put(key,map.get(key)+1);
        }
    }
}