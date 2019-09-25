package T_2;

import java.io.File;
import java.util.Scanner;

/*
键盘录入一个文件夹路径，删除该路径下的文件夹。
要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹的路径");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        File file = new File(str);
        File[] files = file.listFiles();
        for (File f : files) {
                f.delete();
        }
    }
}
