package Tes1.T_3;

import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        String str1 = "";
        String str2= "";
        String str3 = "";
        String str4= "";
        HashMap<String, String> map = new HashMap<>();
            for (int i = 0; i < 8; i++) {
                str1 += (int) (Math.random()*9+0);
                str2 += (int) (Math.random()*9+0);
                str3 += (int) (Math.random()*9+0);
                str4 += (int) (Math.random()*9+0);
            }
            map.put(str1,"西瓜");
            map.put(str2,"香蕉");
            map.put(str3,"苹果");
            map.put(str4,"橘子");
        Set<String> strings = map.keySet();
        for (String s:strings){
            String value=map.get(s);
            System.out.println(value+"="+s);
        }

    }
}
