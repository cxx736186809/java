package Test8;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> arr = new ArrayList<>();

    public void addGoods(Goods goods) {
        System.out.println("加入 " + goods.getName() + " 成功");
        arr.add(goods);
    }

    public void showGoods() {
        System.out.println("您选购的商品为:");
        for (int i = 0; i < arr.size(); i++) {
            Goods goods = arr.get(i);
            System.out.println("\t" + goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }

    public void total() {
        int total = 0;
        int num = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof EGoods)
                num += 8.8 * arr.get(i).getPrice();
            else
                num += arr.get(i).getPrice();
            total += arr.get(i).getPrice();
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
        System.out.println("原  价为:" + total + " 元");
        System.out.println("折后价为:" + num + " 元");
    }
}