package Tes1.T_1;
/*
ArrayList集合中有如下内容: {33,11,77,55}
1. 使用Collections.sort()对ArrayList集合中的数据进行排序,并打印出排序后的结果。
2. 使用Collections.shuffle ()对ArrayList集合中的数据进行随机打乱顺序,并打印出排序后的结果。
3. 使用Collections.reverse()对ArrayList集合中的数据进行反转,使用增强for遍历ArrayList集合。
 */
import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Collections.addAll(arr,33,11,77,55);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        for(Integer i:arr)
            System.out.println(i);
    }
}
