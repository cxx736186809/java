package T_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
利用字节输出流一次写一个字节数组的方式向C盘的b.txt文件输出内容。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/b.txt");
        FileOutputStream fos = new FileOutputStream(file);
        byte[] b = "安和桥".getBytes();
        fos.write(b);
        fos.close();
    }
}
