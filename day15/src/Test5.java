/*
 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒。
随机生成10个人，同时准备过此山洞，显示每次通过山洞人的姓名。
 */
public class Test5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    synchronized ("dad") {
                        try {
                            Thread.sleep(1000*5);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("通过山洞的是：" + Thread.currentThread().getName());
                    }
                }
            }.start();
        }
    }
}