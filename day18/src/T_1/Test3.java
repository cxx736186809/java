package T_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
要求：
1.不能覆盖文件中原有的内容
2.每一句输出各占一行
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/a.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        byte[] b = "i love you".getBytes();
        for (int i = 0; i < 5; i++) {
            fos.write("\n\r".getBytes());
            fos.write(b);
        }
        fos.close();
    }
}
