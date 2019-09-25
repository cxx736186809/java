/*
 写一个卖票的程序，
1. 写一个类，该类继承Thread，定义一个变量记录总票数。
2. 开启四个卖票窗口(开始四个线程),同时执行卖票的程序。
要求每卖一张票在控制台输出：当前窗口为：窗口a卖了一张票，剩余票数为19。其中窗口a为线程的名字。
 */
public class Test8 {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("窗口1");
        Ticket t2 = new Ticket("窗口2");
        Ticket t3 = new Ticket("窗口3");
        Ticket t4 = new Ticket("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Ticket extends Thread {
    private static Integer ticket = 1000;
    private static Object obj = new Object();

    public Ticket(String s) {
        super(s);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() +
                        "正在卖第" + (1001 - ticket) + "张票，剩余票数为："+(ticket-1));
                ticket--;
            }
        }
    }
}