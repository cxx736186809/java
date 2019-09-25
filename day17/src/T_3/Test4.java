package T_3;

import java.io.File;
import java.util.Scanner;

/*
从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
例如:
aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹的路径：");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        check(file);
    }

    public static void check(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(f.getAbsolutePath());
                check(f);
            } else {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}