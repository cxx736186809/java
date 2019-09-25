import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        String str = "javajfiwejavajfiowfjavagkljjava";
        int i=getCount(str,"java");
        System.out.println("javajfiwejavajfiowfjavagkljjava字符串中java的数量："+i);
    }

    public static int getCount(String str, String ch) {
        int count = 0;
        while (str.indexOf(ch) != -1) {
            int i = str.indexOf(ch);
            str = str.substring(i + ch.length());
            count++;
        }
        return count;
    }
}