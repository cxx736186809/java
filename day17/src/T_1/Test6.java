package T_1;

import java.io.File;

/*
获取C盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
 */
public class Test6 {
    public static void main(String[] args) {
        File f = new File("D:\\a\\b.txt");
        System.out.println("b.txt的文件名：" + f.getName());
        System.out.println("b.txt的文件大小：" + f.length());
        System.out.println("b.txt的绝对路径：" + f.getAbsolutePath());
        System.out.println("b.txt的父路径：" + f.getPath());
    }
}
