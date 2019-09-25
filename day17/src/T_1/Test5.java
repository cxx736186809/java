package T_1;

import java.io.File;

/*
将C盘下a.txt文件删除
将C盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
 */
public class Test5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\a.txt");
        File f2 = new File("D:/a");
        System.out.println("是否删除a.txt成功：" + f1.delete());
        System.out.println("是否删除a文件夹成功：" + f2.delete());
    }
}
