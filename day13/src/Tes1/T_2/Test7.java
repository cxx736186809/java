package Tes1.T_2;
/*
键盘录入一个字符串.去掉其中重复字符, 打印出不同的那些字符.必须保证顺序.例如输入:aaaabbbcccddd,打印结果
为：abcd
 */


import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        String a=sc.nextLine();
        char[] b=a.toCharArray();
        for (char s:b){
            lhs.add(s);
        }
        for (char s:lhs)
            System.out.print(s+"\t");
    }

}
