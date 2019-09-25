package T_1;

import java.io.File;

/*
获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
注意：不包含子文件夹下的文件
 */
public class Test8 {
    public static void main(String[] args) {
        File f2 = new File("D:\\a");
        f2.mkdir();
        File[] files = f2.listFiles();
        for (File f : files)
            System.out.println(f);
    }
}
