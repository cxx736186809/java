package Tes1.T_1;
/*
自定义泛型方法function.可以传入任意类型数据t.在这个方法中打印传入的t.并使用这个泛型方法。
 */

public class Test6 {
    public static void main(String[] args) {
        function("123");
        function(123);
    }

    public static <MVP> void function(MVP mvp) {
        System.out.println(mvp);
    }
}
