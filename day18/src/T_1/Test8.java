package T_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输入多条信息，每条信息存储一行。当用户输
入：”886”时，程序结束。
 */
public class Test8 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/Info.txt", true);
        System.out.println("请输入录入的信息：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if ("886".equals(s))
                break;
            byte[] a = s.getBytes();
            fos.write("\n\r".getBytes());
            fos.write(a);
        }
        fos.close();
    }
}
