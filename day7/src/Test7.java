import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String str = s.next();
        checkQQ(str);
    }

    public static void checkQQ(String qq) {
        int error = 0;

        char[] chars = qq.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9')
                error++;
        }

        if (qq.length() >= 5 && qq.length() <= 12) {
            if (qq.charAt(0) != 0) {
                if (error == 0)
                    System.out.println("这个QQ号码是否正确：true");
                else
                    System.out.println("这个QQ号码是否正确：false");
            } else
                System.out.println("这个QQ号码是否正确：false");
        } else
            System.out.println("这个QQ号码是否正确：false");
    }
}