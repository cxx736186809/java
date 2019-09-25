public class Test7 {
    public static void main(String[] args) {
        Manager m = new Manager("c110", "老王", 10000);
        m.eat();
        m.work();
        Cook c = new Cook("m110", "小王", 6000);
        c.eat();
        c.work();
    }
}


class Cook extends Staff {
    public Cook() {
    }

    public Cook(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void eat() {
        System.out.println("工号为:" + getId() + ",姓名为:" + getName() + "工资为:" +
                getMoney() + "的厨师在吃肉");
    }

    @Override
    public void work() {
        System.out.println("工号为:" + getId() + ",姓名为:" + getName() + "工资为:" +
                getMoney() + "的厨师在工作,炒菜");
    }
}

class Manager extends Staff {
    public Manager() {
    }

    public Manager(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void eat() {
        System.out.println("工号为:" + getId() + ",姓名为:" + getName() + "工资为:" +
                getMoney() + "的经理在吃鱼");
    }

    @Override
    public void work() {
        System.out.println("工号为:" + getId() + ",姓名为:" + getName() + "工资为:" +
                getMoney() + "的经理在工作,管理其他人");
    }
}

abstract class Staff {
    private String id;
    private String name;
    private double money;

    public Staff() {
    }

    public Staff(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract void work();

    public abstract void eat();
}
