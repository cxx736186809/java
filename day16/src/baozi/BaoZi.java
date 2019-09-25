package baozi;

public class BaoZi {
    private String name;
    private double price;
    private int flag;

    public BaoZi(String name, double price, int flag) {
        this.name = name;
        this.price = price;
        this.flag = flag;
    }

    public BaoZi() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
