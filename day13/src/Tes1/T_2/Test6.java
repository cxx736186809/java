package Tes1.T_2;
/*
编写一个程序，获取10个1至20的随机数，要求随机数不能重复。使用迭代器把最终的结果输出到控制台。
 */
import java.util.HashSet;

public class Test6 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        while (hs.size()<10){
//            Random random = new Random();
//            int i = random.nextInt(20); //    [0,20)
            hs.add((int) (Math.random()*20));
        }
        for (Integer s:hs)
            System.out.print(s+"\t");
    }

}
