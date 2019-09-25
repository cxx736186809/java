import java.io.*;
import java.util.Date;

/*
D盘中的test文件夹下有个a.txt文件，把它复制到D盘的test2文件夹中,文件名以时间戳为前缀，例如：201901011830000abc.txt
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/a.txt");
        File f1 = new File("d:/test2");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f1.getAbsoluteFile() + "\\" + new Date().getTime() + f.getName());
        byte[] a = new byte[1024];
        int len;
        while ((len = fis.read(a)) != -1)
            fos.write(a, 0, len);
        fos.close();
        fis.close();
    }
}
