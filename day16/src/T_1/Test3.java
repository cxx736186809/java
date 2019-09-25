package T_1;

import java.util.ArrayList;
import java.util.concurrent.*;
/*
使用线程池,分别开启三条线程,生成10个1到100的随机数,然后计算他们的平均数, 最后计算这三个平均数的平
均数.(使用Callable)
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int num=0;
        ArrayList<Future> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(3);
        MyRunnable r=new MyRunnable();
        for (int i = 0; i < 3; i++) {
            futures.add(service.submit(new MyRunnable()));
        }
        for (Future fu:futures){
            num +=(int) fu.get();
        }
        System.out.println(num/3);
    }
}
class MyRunnable implements Callable {


    @Override
    public Object call() throws Exception {
        int num=0;
        for (int i = 0; i < 10; i++) {
            num+=Math.random()*100+1;
        }
        int average=num/10;
        System.out.println(average);
        return average;
    }
}