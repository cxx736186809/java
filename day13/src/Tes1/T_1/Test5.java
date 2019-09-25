package Tes1.T_1;
/*
往HashSet中添加字符串"zhangsan", "lisi","wangwu", "zhangsan".使用迭代器获取HashSet中的元素.
 */
import java.util.HashSet;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add(new String("zhangsan"));
        hs.add("lisi");
        hs.add("wangwu");
        hs.add("zhangsan");
        Iterator it=hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
