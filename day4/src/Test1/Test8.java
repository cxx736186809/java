package Test1;

public class Test8 {
    public static void main(String[] args) {
        double s = 30.0;
        System.out.println("摄氏度为:" + s +"°‐‐华氏度为:" + sToh(s)+"°");
        double h = 86.0;
        System.out.println("华氏度为:" + h +"°‐‐摄氏度为:" + hTos(h)+"°");
    }
    public static double sToh(double s) {
        return (9.0 / 5) * s + 32;
    }
    public static double hTos(double h) {
        return (h - 32 ) / 9.0 * 5;
    }
}