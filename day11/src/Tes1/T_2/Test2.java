package Tes1.T_2;

/*
测试以下两个操作执行所消耗的时间
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long d1 = System.currentTimeMillis();

        long s2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long d2 = System.currentTimeMillis();
        System.out.println("创建String对象共耗时毫秒：" + (d1-s1));
        System.out.println("=================================");
        System.out.println("创建StringBuilder共耗时毫秒：" + (d2-s2));
    }

}
