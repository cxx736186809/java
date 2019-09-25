package Test8;

public class Test8 {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        Goods g1 = new Laptop("g10000", "笔记本", 10000);
        Goods g2 = new Phone("g10001", "手机", 5000);
        Goods g3 = new Fruit("g20000", "苹果", 50);
        System.out.println("============添加商品=================");
        gouWuChe.addGoods(g1);
        gouWuChe.addGoods(g2);
        gouWuChe.addGoods(g3);
        System.out.println("============打印商品=================");
        gouWuChe.showGoods();
        gouWuChe.total();
    }
}