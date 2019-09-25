public class Test9 {
    public static void main(String[] args) {
        int cout = 0;
        for (int i = 1; i < 8; i++) {
            for (int g = 1; g < 8; g++) {
                if (i == g || i==(8-g)) {
                    System.out.print("o" + "\t");
                } else {
                    System.out.print("*" + "\t");
                }
                cout++;
                if (cout == 7) {
                    System.out.println();
                    cout = 0;
                }
            }
        }
    }
}