package Tes1.T_2;
/*
ArrayList有以下元素: "a","f","b","c","a","d"利用HashSet对ArrayList集合去重(最终结果: ArrayList中没有重复元素)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"a","f","b","c","a","d");
        HashSet<String> hs=new HashSet<>();
        hs.addAll(arr);
        arr.clear();
        arr.addAll(hs);
        System.out.println(arr);
    }
}
