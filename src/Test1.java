/*
输出格式：XXX窗口正在卖第x张票，剩余y张。
 */
public class Test1 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t,"北京窗口").start();
        new Thread(t,"上海窗口").start();
        new Thread(t,"澳门窗口").start();
    }
}

class Ticket implements Runnable {
    int ticket = 100;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (ticket <= 0)
                    break;
                System.out.println(Thread.currentThread().getName()+"正在卖第"+(100-ticket+1)+"张票，剩余"+(ticket-1)+"张。");
                ticket--;
            }
        }
    }
}