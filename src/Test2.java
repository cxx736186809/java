/*
利用递归求5！
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(count(5));
    }

    public static int count(int num) {
        if (num == 1)
            return 1;
        return num * count(num - 1);
    }
}
