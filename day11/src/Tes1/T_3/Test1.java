package Tes1.T_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/*
使用类把2016-12-18转换为2015年12月18日
 */
public class Test1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期，格式如下：1992-10-20");
        Scanner sc = new Scanner(System.in);
        String time=sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(time);
        sdf.applyPattern("yyyy年MM月dd日");
        String s = sdf.format(d);
        System.out.println(s);
    }
}
