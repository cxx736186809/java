package Tes1.T_2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
如用户输入字符串:"helloworld java",程序输出结果：h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
注：输出结果不要求顺序一致
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!hashMap.containsKey(ch[i]))
                hashMap.put(ch[i], 1);
            else
                hashMap.put(ch[i], hashMap.get(ch[i]) + 1);
        }
        Set<Character> keySet = hashMap.keySet();
        for (Character c:keySet) {
            Integer value = hashMap.get(c);
            System.out.print(c+"("+value+")\t");
        }
    }
}
