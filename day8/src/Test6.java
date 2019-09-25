public class Test6 {
    public static void main(String[] args) {

    }
}


class cock extends poultry {
    public cock() {
    }

    public cock(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在啄米");
    }

    public void crow() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在打鸣");
    }
}

class duck extends poultry {
    public duck() {
    }

    public duck(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getColor() + "的鸭子在吃饭");
    }

    public void swim() {
        System.out.println(getAge() + "岁的" + getColor() + "的鸭子在游泳");
    }
}

abstract class poultry {
    private int age;
    private String color;

    public poultry() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public poultry(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public abstract void eat();
}
