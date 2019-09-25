package T_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
利用字节输入流读取C盘文件b.txt的内容，使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取
到的字节数组转换成字符串输出到控制台。
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/a.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] a = new byte[2];
        int len;
        while ((len=fis.read(a))!=-1)
            System.out.println(new String(a));
        fis.close();
    }
}
