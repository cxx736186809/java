package T_1;
/*
1. 给定一个计算器 Calculator 接口，内含抽象方法 calc(减法)，其功能是可以将两个数字进行相减，并返回差值。
2. 在下面的代码中，请分别使用Lambda的标准格式及省略格式调用 invokeCalc 方法，完成130和120的相减计算：
 */
public class Test7 {
    public static void main(String[] args) {
        invokeCalc(130,120,(int a,int b)->{
            return a-b;
        });
    }
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
interface Calculator {
    int calc(int a, int b);
}