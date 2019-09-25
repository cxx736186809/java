package T_3;

import java.io.File;

/*
使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)。
 */
public class Test1 {
    public static void main(String[] args) {
        File f = new File("d:/a");
        size(f);

    }

    public static void size(File file) {
        File[] files = file.listFiles(f -> {
            return f.length() < 200;
        });
        for (File f : files) {
            if (f.isDirectory()) {
                size(f);
            } else {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
