package T_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个文件的路径：");
        Scanner sc = new Scanner(System.in);
        File f = new File(sc.nextLine());
        if (f.exists())
            System.out.println("文件大小为：" + f.length());
        else {
            f.createNewFile();
            System.out.println("文件创建成功");
        }
    }
}