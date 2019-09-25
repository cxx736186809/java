package T_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
如果是文件，则输出文件的大小
如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个文件的路径：");
        Scanner sc = new Scanner(System.in);
        File f = new File(sc.nextLine());
        if (f.exists()) {
            if (f.isFile())
                System.out.println("文件大小为：" + f.length());
            if (f.isDirectory()) {
                int num = 0;
                File[] files = f.listFiles();
                for (File file : files) {
                    num += file.length();
                }
                System.out.println("该文件夹下所有文件的大小为：" + num);
            }
        } else {
            System.out.println("文件不存在，创建文件");
            f.createNewFile();
            System.out.println("文件大小为：" + f.length());
        }
    }
}
