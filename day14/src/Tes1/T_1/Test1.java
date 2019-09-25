package Tes1.T_1;
/*
练习Map集合的常用方法: put, get, remove
 */
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"sdad");
        map.put(2,"sdasdad");
        map.put(3,"sdaddsada");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.remove(2));
    }
}
