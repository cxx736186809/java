package Tes1.T_2;
/*
使用代码实现计算你活了多少天
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日，格式如下：1992-10-20");
        String bir = new Scanner(System.in).next();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(bir);
        Date now = new Date();
        long nowS = now.getTime();
        long dateS = date.getTime();
        long s = nowS - dateS;
        if (s<0) {
            System.out.println("还没出生呢");
        } else {
            System.out.println(s/ 1000 / 60 / 60 / 24);
        }
    }
}
