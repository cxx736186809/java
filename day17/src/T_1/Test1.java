package T_1;

import java.io.File;

/*
1.绝对路径创建文件对象：使用File类一个参数的构造方法。
2.相对路径创建文件对象：使用File类两个参数的构造方法。
 */
public class Test1 {
    public static void main(String[] args) {
        File file1 = new File("D:\\d.txt");
        File file2 = new File("D:\\idea_day17");
        String a = "d.txt";
        File file3 = new File(file2, a);
        System.out.println(file1.getAbsolutePath());
        System.out.println(file3.getAbsolutePath());
    }
}
