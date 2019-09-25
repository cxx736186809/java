package Tes1.T_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        Human h1 = new Human("小米", 16, 1.60);
        Human h2 = new Human("小乐", 17, 1.70);
        Human h3 = new Human("小李", 18, 1.80);
        Human h4 = new Human("小董", 19, 1.90);
        Human h5 = new Human("小方", 20, 2.00);
        Collection<Human> col = new ArrayList<>();
        col.add(h1);
        col.add(h2);
        col.add(h3);
        col.add(h4);
        col.add(h5);
        Iterator<Human> it = col.iterator();
        while (it.hasNext()) {
            Human h = it.next();
            h.setAge(h.getAge() + 2);
        }
        for (Human a : col) {
            System.out.println(a);
        }
    }
}

class Human {
    private String name;
    private int age;
    private double height;

    public Human() {
    }

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + height;
    }
}