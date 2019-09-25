package Test3;

public class Test {
    public static void main(String[] args) {
        Dog c = new Dog();
        c.name = "旺财";
        c.eat();
        c.lookHome();
        System.out.println("-----------");
        Cat t=new Cat();
        t.name="波斯猫";
        t.eat();
        t.catchMouse();
    }
}
