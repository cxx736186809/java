package T_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
利用字节输出流一次写一个字节的方式向C盘的a.txt文件输出内容。
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(97);
        fos.close();
    }
}
