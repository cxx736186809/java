public class Test5 {
    public static void printNum(){
        float f1=12345.01F;
        float f2=12345.00F;
        float var1;
        float var2;
        var1=f1>f2?12456:12456.02f;
        var2=var1+1024;
        System.out.println("var1的值为："+var1+" var2的值为："+var2);
    }
    public static void main(String[] args) {

        printNum();
    }
}

