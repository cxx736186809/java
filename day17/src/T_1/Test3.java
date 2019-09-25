package T_1;

import java.io.File;

/*
在C盘下创建一个名为bbb的文件夹
 */
public class Test3 {
    public static void main(String[] args) {
        File f = new File("D:/a");
        System.out.println("是否创建成功：" + f.mkdir());
    }
}
