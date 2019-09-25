public class Test4 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}

class C extends B {

    int numc = 30;

    @Override
    public void showA() {
        System.out.println("A类中numa：" + numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中numb：" + numb);
    }

    public void showC() {
        System.out.println("C类中numc：" + numc);
    }
}

abstract class A {
    int numa = 10;

    public abstract void showA();
}

abstract class B extends A {
    int numb = 20;

    abstract void showB();
}

