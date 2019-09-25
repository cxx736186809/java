package Test2.T_3.Test1;

/*
定义学生类(Student)
a) 属性：name和score
b) 提供空参构造
c) 提供有参构造;
i. 使用setXxx方法给名称和score赋值
d) 提供setter和getter方法
i. 在setScore(intscore)方法中
1. 首先判断,如果score为负数,就抛出NoScoreException,异常信息为：分数不能为负数:xxx.
2. 然后在给成员score赋值.
 */
public class DebitCard {
    private Integer accountNumber;
    private double money;

    public DebitCard() {
    }

    public DebitCard(Integer accountNumber, double money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money<0)
            throw new NoaccountNumberException("余额不能为负数");
        this.money = money;
    }
}
