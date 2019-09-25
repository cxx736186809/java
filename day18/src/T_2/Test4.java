package T_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
IO对象Properties结合使用,设置properties文件
1. 创建一个空的Properties集合
2. 读取数据到集合中
3. 遍历集合，获取到每一个key
4. 判断 当前的key 是否为 "lisi"，如果是就把"lisi"的值 设置为100
5. 把集合中所有的信息 ，重新存储到文件中
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream("d:/score.txt"));
        FileOutputStream fos = new FileOutputStream("d:/score.txt");
        Set<String> strings = p.stringPropertyNames();
        for (String key:strings){
            if("lisi".equals(key))
                p.setProperty(key,"100");
        }
        for (String s:strings){
            byte[] a = (s+"="+p.getProperty(s)).getBytes();
            fos.write(a);
            fos.write("\n".getBytes());
        }
    }
}
