package T_1;

import java.io.File;
import java.io.IOException;

/*
1.判断File对象是否文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
2.判断File对象是否文件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)
 */
public class Test7 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\b.txt");
        File f2 = new File("D:/a");
        f1.createNewFile();
        f2.mkdir();
        System.out.println("文件名：" + f1.getAbsolutePath() + "是否是文件：" + f1.isFile());
        System.out.println("文件名：" + f1.getAbsolutePath() + "是否是文件夹：" + f1.isDirectory());
        System.out.println("文件名：" + f2.getAbsolutePath() + "是否是文件：" + f2.isFile());
        System.out.println("文件名：" + f2.getAbsolutePath() + "是否是文件夹：" + f2.isDirectory());
    }
}
