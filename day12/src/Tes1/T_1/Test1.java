package Tes1.T_1;
/*
练习Collection的add,remove,clear,size方法
 */
import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList();
        collection.add("123");
        collection.add("456");
        collection.add("789");
        collection.add("000");
        System.out.println("集合：" + collection);
        collection.remove("000");
        System.out.println("删除后的集合：" + collection);
        System.out.println("集合的大小" + collection.size());
        collection.clear();
        System.out.println("清空后的集合：" + collection);
    }
}
