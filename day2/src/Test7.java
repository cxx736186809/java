public class Test7 {

    public static void main(String[] args) {
        add();sub();mul();div();remain();

    }
    public static void add(){
        int x=100;
        int y=200;
        System.out.println("x,y的和为："+(x+y));
    }
    public static void sub(){
        int x=100;
        int y=200;
        System.out.println("x,y的差为："+(x-y));
    }
    public static void mul(){
        int x=100;
        int y=200;
        System.out.println("x,y的积为："+(x*y));
    }
    public static void div(){
        int x=100;
        int y=200;
        System.out.println("x,y的商为："+(x/y));
    }
    public static void remain(){
        int x=100;
        int y=200;
        System.out.println("x,y的余数为："+(x%y));
    }
}

