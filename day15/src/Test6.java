/*
 有100个限量版的水杯，但是只能通过实体店和官网才能进行购买，并且分别统计卖了多少。请用线程进行模
拟并设置线程名称用来代表售出途径，再将信息打印出来。
比如（实体店卖出第1个，总共剩余n个..）
*/
public class Test6 {
    public static void main(String[] args) {
        Cup cup = new Cup();
        Thread t1=new Thread(cup,"实体店");
        Thread t2=new Thread(cup,"官网");
        t1.start();
        t2.start();
    }
}
class Cup implements Runnable{
    private static Integer cup = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(cup<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+
                        "正在卖第" + (101 - cup) + "个杯子,还剩余"+(cup-1)+"个杯子");
                cup--;
            }
        }
    }
}