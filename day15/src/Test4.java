/*
1. 编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”，另一根线程循环输出“显示画面”，要求线
程实现Runnable接口，且使用匿名内部类实现。
 */
public class Test4 {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                while (true)
                    System.out.println("播放背景音乐");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                while (true)
                    System.out.println("显示画面");
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}