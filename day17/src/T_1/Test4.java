package T_1;

import java.io.File;

/*
在C盘下创建一个名为ccc的文件夹，要求如下：
1.ccc文件夹中要求包含bbb子文件夹
2.bbb子文件夹要求包含aaa文件夹
 */
public class Test4 {
    public static void main(String[] args){
        File f = new File("D:/c/b/a");
        System.out.println("是否存在a文件夹：" + f.mkdirs());
    }
}
