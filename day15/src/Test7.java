/*
 有一辆班车除司机外只能承载80个人，假设前中后三个车门都能上车，如果坐满则不能再上车。请用线程模
拟上车过程并且在控制台打印出是从哪个车门上车以及剩下的座位数。
比如:（前门上车---还剩N个座...）
 */
public class Test7 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Thread t1=new Thread(driver,"前门");
        Thread t2=new Thread(driver,"中门");
        Thread t3=new Thread(driver,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Driver implements Runnable{
    private static Integer driver = 1000;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(driver<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+
                        "上车，还剩"+driver+"个座");
                driver--;
            }
        }
    }
}