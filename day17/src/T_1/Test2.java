package T_1;

import java.io.File;
import java.io.IOException;

/*
检查C盘下是否存在文件a.txt,如果不存在则创建该文件。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\a.txt");
        if (f.exists()) {
            System.out.println("文件存在");
        } else {
            f.createNewFile();
            System.out.println("文件创建成功");
        }
    }
}
