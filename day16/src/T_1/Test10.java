package T_1;

import java.util.Random;
/*
使用等待唤醒,实现一个线程给共享对象Person的属性(姓名,性别)赋值,一个线程打印共享对象的属性要求赋值-
>打印->赋值->打印 ... 不允许出现人妖.
 */
public class Test10 {
    public static void main(String[] args) {
        Per1 p = new Per1();
        A a = new A(p);
        B b = new B(p);
        new Thread(a).start();
        new Thread(b).start();
    }
}

class Per1 {
    private String name;
    private String sex;
    private int flag;

    public Per1(String name, String sex, int flag) {
        this.name = name;
        this.sex = sex;
        this.flag = flag;
    }

    public Per1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}

class A implements Runnable {
    private Per1 p;

    public A(Per1 p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int a = new Random().nextInt(3);
            int b = new Random().nextInt(3);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (p) {
                if (p.getFlag() % 2 == 0) {
                    if (a % 3 == 0) {
                        p.setName("小明");
                    } else if (a % 3 == 1) {
                        p.setName("小红");
                    } else {
                        p.setName("小李");
                    }
                    if (b % 3 == 0) {
                        p.setSex("男");
                    } else if (b % 3 == 1) {
                        p.setSex("女");
                    } else {
                        p.setSex("人妖");
                    }
                    p.setFlag(p.getFlag() + 1);
                    System.out.println("正在赋值：姓名为：" + p.getName() + "，性别为：" + p.getSex());
                    try {
                        p.notify();
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class B implements Runnable {
    private Per1 p;

    public B(Per1 p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (p) {
                if (p.getFlag() % 2 == 1) {
                    p.setFlag(p.getFlag() + 1);
                    if (p.getSex().equals("人妖"))
                        System.out.println("不允许出现人妖");
                    else
                        System.out.println("正在输出：姓名为：" + p.getName() + "，性别为：" + p.getSex());
                    try {
                        p.notify();
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}