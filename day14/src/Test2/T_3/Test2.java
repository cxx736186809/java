package Test2.T_3;

/*
开启一个线程执行任务：随机获得10个100到1000的整数并将10个整数相加求和，将求和结果输出。
 */
public class Test2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread("新的线程！");
        mt.start();
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            num += Math.random() * 9900 + 100;
        }
        System.out.println(num);
    }
}