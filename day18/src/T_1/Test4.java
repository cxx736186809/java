package T_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
利用字节输入流读取C盘文件a.txt的内容，使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字
节输出到控制台
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/a.txt");
        FileInputStream fis = new FileInputStream(file);
        int b;
        while ( (b=fis.read()) != -1){
            System.out.println((char) b);
        }
        fis.close();
    }
}
