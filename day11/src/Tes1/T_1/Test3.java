package Tes1.T_1;
/*
获取当前的日期，并把这个日期转换为指定格式的字符串
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:m:ss");
        String format = df.format(now);
        System.out.println(format);

    }
}
