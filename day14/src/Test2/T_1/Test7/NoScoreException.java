package Test2.T_1.Test7;
/*
定义异常类NoScoreException,继承
RuntimeException
a) 提供空参和有参构造方法
 */
public class NoScoreException extends RuntimeException {
    public NoScoreException() {
    }

    public NoScoreException(String s) {
        super(s);
    }
}
