/*
请编写程序，分别打印主线程的名称和子线程的名称。
要求使用两种方式实现：
第一种方式：继承Thread类。
第二种方法：实现Runnable接口。
 */
public class Test3 {
    public static void main(String[] args) {
        //方法1：继承Thread类
        System.out.println("主线程的名称是："+Thread.currentThread().getName());
        MyThread thread = new MyThread();
        thread.start();
        //方法2：实现Runnable接口
        System.out.println("主线程的名称是："+Thread.currentThread().getName());
        MyThread1 thread1 = new MyThread1();
        Thread t = new Thread(thread1);
        t.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("子线程的名称是："+getName());
    }
}
class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("子线程的名称是："+getClass());
    }
}