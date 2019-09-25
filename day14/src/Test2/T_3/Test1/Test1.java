package Test2.T_3.Test1;

/*
请使用代码描述:
每一张借记卡(DebitCard)都有账号(accountNumber)和余额(money); 余额永远不能为负数
要求：当借记卡的余额为负数的时候需要抛出自定的异常
 */
public class Test1 {
    public static void main(String[] args) {
        DebitCard s1=new DebitCard(1354,-1.0);
        DebitCard s2=new DebitCard();
        s2.setAccountNumber(20);
        s2.setAccountNumber(-10);
    }
}
