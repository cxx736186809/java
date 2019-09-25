package Tes1.T_1;
/*
使用LinkedHashSet存储以下元素:"王昭君","王昭君","西施","杨玉环","貂蝉".使用迭代器和增强for循环遍历
LinkedHashSet
 */
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test8 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("王昭君");
        lhs.add("王昭君");
        lhs.add("西施");
        lhs.add("杨玉环");
        lhs.add("貂蝉");
        Iterator<String> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+"\t");
        }
        for (String s:lhs)
            System.out.print(s+"\t");
    }
}
