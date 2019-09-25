package Test3;

public class Test3 {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.showA();
        bb.showB10();
        bb.showC10();
    }
}

interface AA {
    public abstract void showA();

    private void show10(String str) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(str + "\t");
        }

    }

    public default void showB10() {
        show10("BBBB");
        System.out.println();
    }

    public default void showC10() {
        show10("CCCC");
        System.out.println();
    }

}

class BB implements AA {

    @Override
    public void showA() {
        System.out.println("AAAA");
    }
}

