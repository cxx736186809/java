package baozi;

public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        ProductThread pt = new ProductThread(bz);
        ConsumerThread ct = new ConsumerThread(bz);
        new Thread(pt).start();
        new Thread(ct).start();
    }
}
