public class Test6 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int g = i%10;
            int sw = i/10%10;
            int b = i/100%10;
            if (i==(g*g*g+sw*sw*sw+b*b*b))
                System.out.println(i);
        }
    }
}