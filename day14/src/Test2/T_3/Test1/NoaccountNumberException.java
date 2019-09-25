package Test2.T_3.Test1;
/*
定义异常类NoScoreException,继承
RuntimeException
a) 提供空参和有参构造方法
 */
public class NoaccountNumberException extends RuntimeException {
    public NoaccountNumberException() {
    }

    public NoaccountNumberException(String s) {
        super(s);
    }
}
