package Test2.T_1;

import Tes1.T_1.Test2;

/*
1. 写一个方法实现获取字符串某个索引上的字符的功能
2. 写一个测试方法调用上面写的方法,使用thows方式进行处理异常,并在main方法中调用这个测试方法
3. 再写一个测试方法调用上面写的方法,使用try...catch方式进行处理异常,并在main方法中调用这个测试方法
 */
public class Test6 {
    public static void main(String[] args) throws Exception {
        getChar(null, 1);
        testThrows();
        testTryCatch();
    }

    public static char getChar(String str, int index) throws Exception {
        if (str == null)
            throw new Exception("字符串不能为null");
        if (str.equals(""))
            throw new Exception("字符串不能为空");
        if (index < 0 || index > str.length() - 1)
            throw new Exception("索引越界");
        char a = str.charAt(index);
        return a;
    }

    public static void testThrows() throws Exception {
        getChar("", 1);
    }

    public static void testTryCatch() {
        try {
            getChar("ad", 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

