public class Test5 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.eat();
        c.eat();
        if (d instanceof Dog) {
            Dog a = (Dog) d;
            a.lookHome();
        }else if(d instanceof Cat){
            Cat b = (Cat) c;
            b.catMouse();
        }
        if (c instanceof Cat) {
            Cat b = (Cat) c;
            b.catMouse();
        }else if (c instanceof Dog){
            Dog a = (Dog) d;
            a.lookHome();
        }
    }


}

abstract class Animal {
    String name;
    int weight;

    public abstract void eat();
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catMouse() {
        System.out.println("努力抓老鼠");
    }
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("老老实实看家");
    }
}