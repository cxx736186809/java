public class Test7 {
    public static void main(String[] args) {
        int cout = 0;
        for (int i = 1; i <= 60; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
                cout++;
            }
            if (cout % 5 == 0)
                System.out.println();
        }
    }
}