package Tes1.T_1;
/*
往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使用迭代器获取ArrayList集合中的元素
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        Iterator<String> ite = coll.iterator();
        while (ite.hasNext()) {
            String s = ite.next();
            System.out.println(s);
        }
    }
}
