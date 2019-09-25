package Test5;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String name,int age, String subject) {
        super(name,age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject() {
        this.subject = subject;
    }

    public void teachMethod() {

        System.out.println(getName()+"老师，讲授"+subject);
    }
}
