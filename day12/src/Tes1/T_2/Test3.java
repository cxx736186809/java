package Tes1.T_2;

import java.util.ArrayList;

/*
ArrayList中有如下数据:”a”,”b”, ”c”, ”c”, ”a”, ”b”, ”b”, ”b”, ”a”.定义名为:frequency(ArrayListarr, String key)的方
法.arr是ArrayList集合,key是要查找的某个元素.使用增强for方式查找key在ArrayList中出现的次数.并将次数作为方
法的返回值.在mian方法中调用frequency方法
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("c");
        arr.add("a");
        arr.add("b");
        arr.add("b");
        arr.add("b");
        arr.add("a");
        System.out.println("ArrayList集合中某元素出现次数："+frequency(arr,"b"));
    }
    public static int frequency(ArrayList arr,String key){
        int num=0;
        for(Object a:arr){
            if (a.equals(key))
                num++;
        }
        return num;
    }
}

