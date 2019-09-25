package baozi;

public class ConsumerThread implements Runnable {

    private BaoZi bz;

    public ConsumerThread(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int index = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (bz) {
                if (bz.getFlag() % 2 == 0) {
                    if (index % 3 == 0) {
                        bz.setName("肉包");
                        bz.setPrice(2);
                    } else if (index % 3 == 1) {
                        bz.setName("菜包");
                        bz.setPrice(1);
                    } else {
                        bz.setName("馒头");
                        bz.setPrice(0.5);
                    }
                    index++;
                    bz.setFlag(bz.getFlag() + 1);
                    System.out.println("生产线程正在生产: " + bz.getName() + ";价格为: " + bz.getPrice());
                    try {
                        bz.notify();
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

