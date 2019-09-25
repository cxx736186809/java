package Test5;

public class Student extends Person {
    private double grade;

    public Student() {
    }

    public Student(String name, int age,int grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void examTest() {
        System.out.println(getName()+"同学，考试得了："+grade+"分");
    }
}
