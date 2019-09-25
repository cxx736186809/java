package T_1;

/*
递归的使用
求1到n的和(n>=100 &&n<=200)
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println(sum(150));;
    }

    public static int sum(int num) {
        if (num==1)
            return 1;
        return num+sum(num - 1);
    }
}
