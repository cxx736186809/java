import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        String mgc="奥巴马";

        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str= s.next();
        System.out.println(str.replace(mgc,"*"));
    }
}
