package T_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
将学生信息保存到C盘下面的stu.txt文件中，一个学生信息占据一行数据。
当用户输入end时停止输入。
* 要求使用字节输出流写出数据
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/stu.txt", true);
        System.out.println("请输入要录入的学生信息：（格式如下：学号-学生名字）");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if ("end".equals(s))
                break;
            byte[] a = s.getBytes();
            fos.write("\n\r".getBytes());
            fos.write(a);
        }
        fos.close();
    }
}
