package Tes1.T_1;
/*
自定义一个泛型接口Inter ,包含show(E e)抽象方法. 使用以下两种方式创建实现类
1. 定义实现类时确定泛型的类型
2. 定义实现类时不确定泛型的类型
然后创建实现类对象并调用show方法。
 */
public class Test7 {
    public static void main(String[] args) {
Imple01 i1=new Imple01();
i1.show("你好");
Imple02<Integer> i2=new Imple02<>();
i2.show(123);
    }

}
interface Inter<E>{
    public abstract void show(E e);
}
class Imple01 implements Inter<String>{

    @Override
    public void show(String e) {
        System.out.println(e);
    }
}
class Imple02<E> implements Inter<E>{

    @Override
    public void show(Object e) {
        System.out.println(e);
    }
}