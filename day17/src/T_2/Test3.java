package T_2;

import java.io.File;
import java.io.IOException;

/*
递归遍历将指定文件夹的所有文件(包括所有子文件夹的文件)的全路径输出在控制台。
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/a");
        getFile(f);
    }

    public static void getFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory())
                getFile(f);
            if (f.isFile())
                System.out.println(f.getAbsolutePath());
        }
    }
}
