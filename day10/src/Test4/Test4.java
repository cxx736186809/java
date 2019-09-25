package Test4;

public class Test4 {
    public static void main(String[] args) {
        Work w = new Work();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");
        System.out.println("默认挑大的:");
        Apple apple = w.pickApple(new Com(), a1, a2);
        System.out.println(apple);
        System.out.println("挑红的:");
        Apple apple3 = w.pickApple(new Com() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                return "红色".equals(a1.getColor()) ? a1 : a2;
            }
        }, a1, a2);
        System.out.println(apple3);

    }

}
