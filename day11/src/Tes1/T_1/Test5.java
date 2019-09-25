package Tes1.T_1;
/*
计算500天后是几几年几月几号
 */
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(cal.DAY_OF_MONTH,500);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日");
    }
}
