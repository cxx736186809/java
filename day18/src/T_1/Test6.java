package T_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
利用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
要求：
1.一次读写一个字节的方式
 */
public class Test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\FTKJ\\Desktop\\a.jpg");
        FileOutputStream fos = new FileOutputStream("d:/a.jpg");
//        byte[] b = new byte[1];
        int len;
        while ((len=fis.read())!=-1)
            fos.write(len);
        fos.close();
        fis.close();
    }
}
