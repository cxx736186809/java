package Tes1.T_2;
/*
编写一个程序，键盘录入多个数字,直到录入-1结束.将录入的重复数据去除,计算这些不重复数据的总和和平均值
 */


import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("请输入多个数字：");
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        while (true) {
            int s = sc.nextInt();
            if (s == -1)
                break;
            lhs.add(s);
        }
        for (Integer i : lhs) {
            num += i;
        }
        System.out.println("输入的数字到-1之前总和为：" + num);
        System.out.println("输入的数字到-1之前平均为：" + num / lhs.size());
    }

}
