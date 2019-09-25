package Test2.T_2.Test2;
/*
在一款角色扮演游戏中,每一个人都会有名字和生命值；角色的生命值不能为负数。
要求：当一个人物的生命值为负数的时候需要抛出自定的异常。
 */
public class Test2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("小刚", -20);
        Person1 person2 = new Person1();
        person2.setLifeValue(20);
        person2.setLifeValue(-20);
    }
}
