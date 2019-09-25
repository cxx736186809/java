package T_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
使用线程池：一个线程计算10! ，一个线程计算5!， 一个线程计算8! 打印在那个线程执行的和执行结果.(使用
Runnable)
 */
public class Test4 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        MyRunnable1 r = new MyRunnable1(10);
        MyRunnable1 r1 = new MyRunnable1(8);
        MyRunnable1 r2 = new MyRunnable1(5);
        service.submit(r);
        service.submit(r1);
        service.submit(r2);
        service.shutdown();
    }
}

class MyRunnable1 implements Runnable {
    private Integer index;

    public MyRunnable1(Integer index) {
        this.index = index;
    }

    @Override
    public void run() {
        int num = 1;
        for (int i = 1; i <= index; i++) {
            num *= i;
        }
        System.out.println(num);
    }
}