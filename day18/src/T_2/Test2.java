package T_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
在C盘下创建一个目录d1,在目录d1下创建若干个文本文件，并在每一个文本文件中添加若干内容。利用字节流
将该目录下的所有文件复制到C盘下的d2目录下。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\b");
        File file1 = new File("D:\\d2");
        //File[] files = file.listFiles();

        String[] list = file.list();
        for (String fileName : list) {
            FileInputStream fis = new FileInputStream(file.getAbsoluteFile()+"\\"+fileName);
            FileOutputStream fos = new FileOutputStream(file1.getAbsoluteFile()+"\\"+fileName);
            byte[] a = new byte[1024];
            int len;
            while ((len = fis.read(a)) != -1)
                fos.write(a, 0, len);
                fos.close();
                fis.close();
        }
    }
}
