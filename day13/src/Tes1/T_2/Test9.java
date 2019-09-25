package Tes1.T_2;
/*
有2个ArrayList,元素如下: array1 = "a","b","a","c","d",array2= "e","f","a","d","g",将两个集合重复项去除后合并成一
个集合
*/


import java.util.ArrayList;
import java.util.HashSet;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList();
        arr1.add("a");
        arr1.add("b");
        arr1.add("a");
        arr1.add("c");
        arr1.add("d");
        ArrayList<String> arr2 = new ArrayList();
        arr2.add("e");
        arr2.add("f");
        arr2.add("a");
        arr2.add("d");
        arr2.add("g");
        HashSet<String> hs = new HashSet<>();
        hs.addAll(arr1);
        hs.addAll(arr2);

        for (String s:hs){
            System.out.print(s+"\t");
        }
    }

}
