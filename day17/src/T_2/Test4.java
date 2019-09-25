package T_2;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/*
获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/a");
        Test41 test41 = new Test41();
        File[] files = f.listFiles(test41);
        for (File file:files)
            System.out.println(file);
    }
}

class Test41 implements FileFilter {
    public Test41() {
        super();
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }
}