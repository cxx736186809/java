package T_3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数
注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
用个数作为value,放入到map集合中,并用两种方式遍历map集合
例如：
doc 的类型的文件有 3 个
java 的类型的文件有 5 个
txt 的类型的文件有 7 个
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹的路径：");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        HashMap<String, Integer> map = count(file);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> s : entrySet)
            System.out.println(s.getKey() + "的类型的文件有：" + s.getValue() + "个");
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Integer value = map.get(s);
            System.out.println(s + "的类型的文件有：" + value + "个");
        }
    }

    public static HashMap<String, Integer> count(File file) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String index = f.getName().substring((f.getName().indexOf("."))+1);
                if(hashMap.containsKey(index)){
                    hashMap.put(index,hashMap.get(index)+1);
                }else {
                    hashMap.put(index,1);
                }
            } else {
                HashMap<String, Integer> count = count(f);
                Set<String> keySet = count.keySet();
                for (String s:keySet){
                    if (hashMap.containsKey(s))
                        hashMap.put(s,hashMap.get(s)+count.get(s));
                    else
                        hashMap.put(s,count.get(s));
                }
            }
        }
        return hashMap;
    }
}

