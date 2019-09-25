package T_2;

import java.io.*;

/*
在C盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
定义一个方法统计test.txt文件中指定字符出现的次数。
比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        check('a');
    }

    public static void check(char ch) throws IOException {
        int count = 0;
        File file = new File("d:/b.txt");
        FileInputStream fis = new FileInputStream(file);
        int a;
        while ((a = fis.read()) != -1) {
            if (a == ch)
                count++;
        }
        System.out.println(ch+"出现："+count+"次");
    }
}
