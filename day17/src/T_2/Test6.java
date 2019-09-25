package T_2;

import java.io.File;
import java.util.Scanner;

/*
从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹的路径：");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        System.out.println(calculate(file));

    }

    public static long calculate(File file) {
        File[] files = file.listFiles();
        long size = 0;
        for (File f : files) {
            if (f.isFile())
                size += f.length();
            else
                calculate(f);
        }
        return size;
    }
}
