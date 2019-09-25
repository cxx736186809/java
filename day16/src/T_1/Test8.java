package T_1;

import java.util.Arrays;
/*
对Java基础班学生的考试成绩进行排序
定义一个学生类，有两个属性。姓名，考试成绩
在测试类中定义一个学生数组，存储学生信息。
使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
 */
public class Test8 {
    public static void main(String[] args) {
        Stu3[] arr = {
                new Stu3("小明", 80),
                new Stu3("小芳", 70),
                new Stu3("小李", 90)};
        Arrays.sort(arr, (Stu3 s1,Stu3 s2) -> {
            return (int) (s2.getGrade() - s1.getGrade());
        });
        for (Stu3 stu3 : arr)
            System.out.println(stu3);
    }
}

class Stu3 {
    private String name;
    private double grade;

    public Stu3(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", grade=" + grade;
    }
}