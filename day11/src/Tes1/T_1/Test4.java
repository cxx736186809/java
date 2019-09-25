package Tes1.T_1;
/*
把你的生日字符串（转换为对应的日期对象）
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日，格式如下：1992-10-20");
        Scanner sc = new Scanner(System.in);
        String Birthday=sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(Birthday);
        System.out.println(date);

    }
}
