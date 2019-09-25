public class Test6 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云", 45);
        SportTeacher t2 = new SportTeacher("大姚", 35);
        Student s1 = new Student("小王", 20);
        SportStudent s2 = new SportStudent("王中王", 21);
//        goToSport(t1);
        goToSport(t2);
//        goToSport(s1);
        goToSport(s2);
    }

    public static void goToSport(Sport sport) {
        sport.playBasketball();
    }
}

abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}

interface Sport {
    public abstract void playBasketball();
}

class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }
}

class SportTeacher extends Teacher implements Sport {
    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的老师在打篮球");
    }
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
    }
}

class SportStudent extends Student implements Sport {
    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的学生在打篮球");
    }
}