package T_1;

import java.util.Arrays;
import java.util.Random;
/*
某公司组织年会，会议入场时有两个入口，在入场时每位员工都能获取一张双色球彩票，假设公司有100个员工，
利用多线程模拟年会入场过程，并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程运行后打印格式如下：
 */
public class Test11 {
    public static void main(String[] args) {
        Arrival arrival = new Arrival();
        Thread t1=new Thread(arrival,"前门");
        Thread t2=new Thread(arrival,"后门");
        t1.start();
        t2.start();
    }
}

class DoubleColorBallUtil {
    // 产生双色球的代码
    public static String create() {
        String[] red = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                "24", "25", "26", "27", "28", "29", "30", "31", "32", "33"};
//创建蓝球
        String[] blue = "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16".split(",");
        boolean[] used = new boolean[red.length];
        Random r = new Random();
        String[] all = new String[7];
        for (int i = 0; i < 6; i++) {
            int idx;
            do {
                idx = r.nextInt(red.length);//0‐32
            } while (used[idx]);//如果使用了继续找下一个
            used[idx] = true;//标记使用了
            all[i] = red[idx];//取出一个未使用的红球
        }
        all[all.length - 1] = blue[r.nextInt(blue.length)];
        Arrays.sort(all);
        return Arrays.toString(all);
    }
}

class Arrival implements Runnable {
    DoubleColorBallUtil dcb = new DoubleColorBallUtil();
    private static Integer num = 100;

    @Override
    public void run() {
        int a=0;
        int b=0;
        while (true) {
            synchronized (dcb) {
                if (num == 0)
                    break;
                if (getClass().equals("前门"))
                    a++;
                else
                    b++;
                System.out.println("编号为："+num+"的员工从 "+Thread.currentThread().getName()+"入场！拿到的双色球彩票号码是："+dcb.create());
                num--;
            }
        }
        System.out.println("从前门入场的员工总共有："+a+" 位");
        System.out.println("从后门入场的员工总共有："+b+" 位");
    }
}