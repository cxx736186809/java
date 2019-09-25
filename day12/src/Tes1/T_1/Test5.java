package Tes1.T_1;
/*
往ArrayList添加以下元素” xiaomi”, ”xiaomi2”, ” xiaomi3”, ” xiaomi4”使用增强for遍历ArrayList中的元
 */
import java.util.ArrayList;
import java.util.Collection;

public class Test5 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("xiaomi");
        col.add("xiaom2");
        col.add("xiaom3");
        col.add("xiaom4");
        for(String a:col)
            System.out.println(a);
    }
}
