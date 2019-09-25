package Test2.T_1.Test7;
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
public class Stu1 {
    private String name;
    private double score;

    public Stu1() {
    }

    public Stu1(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score<0)
            throw new NoScoreException("分数不能为负数:"+score);
        this.score = score;
    }

}
