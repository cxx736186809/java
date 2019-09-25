package T_3;

import java.io.File;
import java.util.Scanner;

/*
键盘录入一个文件夹路径，删除该路径下的文件夹。
要求：文件夹中包含有子文件夹
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹的路径：");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        del(file);
    }

    public static void del(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                del(f);
                f.delete();
            } else
                f.delete();
        }
    }
}

