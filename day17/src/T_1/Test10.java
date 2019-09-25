package T_1;

/*
递归的使用
求整数n的阶乘(n <=10)
 */
public class Test10 {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int num) {
        if (num == 1)
            return 1;
        return num * sum(num - 1);
    }
}
