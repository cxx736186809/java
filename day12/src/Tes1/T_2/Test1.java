package Tes1.T_2;
/*
自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.创建5个学生放到
ArrayList中.使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        double Totalscore=0.0;
        double Highestscore=0.0;
        double Lowestscore=0.0;
        Student s1=new Student("小明",15,60);
        Student s2=new Student("小红",16,80);
        Student s3=new Student("小刚",17,70);
        Student s4=new Student("小吕",18,100);
        Student s5=new Student("小方",19,90);
        Collection<Student> col=new ArrayList<>();
        col.add(s1);
        col.add(s2);
        col.add(s3);
        col.add(s4);
        col.add(s5);
        Lowestscore= s1.getGrade();
        Iterator<Student> it=col.iterator();
        while (it.hasNext()){
            Student s=it.next();
            Totalscore+=s.getGrade();
            if(Highestscore<s.getGrade())
                Highestscore=s.getGrade();
            if(Lowestscore>s.getGrade())
                Lowestscore=s.getGrade();
        }
        System.out.println("这5个学生的总分是："+Totalscore);
        System.out.println("这5个学生的平均分是："+Totalscore/5);
        System.out.println("这5个学生中最高分是："+Highestscore);
        System.out.println("这5个学生的最低分是："+Lowestscore);
    }
}
class Student {
    private String name;
    private int age;
    private double grade;

    public Student() {
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}