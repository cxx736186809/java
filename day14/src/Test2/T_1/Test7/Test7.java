package Test2.T_1.Test7;
/*
1. 每一个学生(Student)都有学号,姓名和分数,分数永远不能为为负数。
2. 如果试图给学生赋值一个负数,抛出一个自定异常 。
3. 定义学生类(Student)
4. 定义测试类Test07
a) 提供main方法,在main方法中
i. 使用满参构造方法创建Student对象,分数传入一个负数,运行程序。
ii. 由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
iii. 使用空参构造创建Student对象
iv. 调用setScore(int score)方法,传入一个正数,运行程序
v. 调用setScore(int score)方法,传入一个负数,运行程序
 */
public class Test7 {
    public static void main(String[] args) {
        Stu1 s1=new Stu1("小明",-1);
        Stu1 s2=new Stu1();
        s2.setScore(70);
        s2.setScore(-1);
    }
}
