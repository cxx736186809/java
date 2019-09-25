package Test2;

public class Test {
    public static void main(String[] args) {
        Coder c = new Coder();
        c.name = "马化腾";
        c.eat();
        c.sleep();
        c.coding();
        Teacher t=new Teacher();
        System.out.println("-----------");
        t.name="马云";
        t.eat();
        t.sleep();
        t.teach();
    }
}
