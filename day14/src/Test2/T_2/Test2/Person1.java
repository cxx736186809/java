package Test2.T_2.Test2;

public class Person1 {
    private String name;
    private int lifeValue;

    public Person1() {
    }

    public Person1(String name, int lifeValue) {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue<0)
            throw new NoLifeValueExption("生命值不能为负数:"+lifeValue);
        this.lifeValue = lifeValue;
    }
}
