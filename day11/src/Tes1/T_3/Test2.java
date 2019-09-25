package Tes1.T_3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
    }

    public static void chaoshigouwu() {
    }

    {
        //        ArrayList<Goods> arr = new ArrayList<>();
        Goods g1 = new Goods("001", "少林核桃", 15.5, "斤");
        Goods g2 = new Goods("002", "尚康饼干", 14.5, "包");
        Goods g3 = new Goods("003", "移动硬盘", 345.0, "个");
        Goods g4 = new Goods("004", "高清无码", 199.0, "G");
//        arr.add(g1);
//        arr.add(g2);
//        arr.add(g3);
//        arr.add(g4);
        System.out.println("\t\t\t欢迎使用超市购物系统");
        System.out.println("请输入您要进行的操作：");
        System.out.println("1:购买商品\t\t2:结算并打印小票\t\t3：退出系统");
        Scanner sc1 = new Scanner(System.in);
        String zhixing = sc1.nextLine();

        System.out.println("----------------------------------------");
        System.out.println("商品id\t\t名称\t\t单价\t\t计价单位");
        System.out.println("\t\t\t商品列表");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println("----------------------------------------");
        for (int i = 0; i > 0; i++) {

        }
        if (zhixing.equals("1")) {
            System.out.println("请输入您要购买的商品项（输入格式：商品id-购买数量），输入end表示购买结束。");
            Scanner sc2 = new Scanner(System.in);
            String goumai = sc2.nextLine();
            Goods goods = new Goods();
            if (goumai.equals(goods)) {
            } else if (zhixing.equals("2")) {
                System.out.println("----------------------------------------");
                System.out.println("名称\t\t售价\t\t数量\t\t金额");
            } else
                System.out.println("请输入要进行的操作：");


        }
    }

    class Goods {
        private String id;
        private String name;
        private double price;
        private String danwei;

        public Goods(String id, String name, double price, String danwei) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.danwei = danwei;
        }

        public Goods() {

        }

        @Override
        public String toString() {
            return id + "\t\t\t" + name + "\t" + price + "\t\t" + danwei;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getDanwei() {
            return danwei;
        }

        public void setDanwei(String danwei) {
            this.danwei = danwei;
        }
    }
}