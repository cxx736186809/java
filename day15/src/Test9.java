/*
开启三个线程，分别执行以下三个运算，并将运算结果输出到控制台。
一个线程计算10!
一个线程计算5!
一个线程计算8!
 */
public class Test9 {

    public static void main(String[] args) {
       new Thread(){
           @Override
           public void run() {
               int num=1;
               for (int i = 1; i < 11; i++) {
                   num*=i;
               }
               System.out.println("10!结果为："+num);
           }
       }.start();
        new Thread(){
            @Override
            public void run() {
                int num=1;
                for (int i = 1; i < 6; i++) {
                    num*=i;
                }
                System.out.println("5!结果为："+num);
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                int num=1;
                for (int i = 1; i < 8; i++) {
                    num*=i;
                }
                System.out.println("8!结果为："+num);
            }
        }.start();
    }
}