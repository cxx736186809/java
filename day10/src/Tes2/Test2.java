package Tes2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("小红");
        Student s2 = new Student("小亮");
        Student s3 = new Student("小明");
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        Teacher t = new Teacher("张老师");
        Course course = new Course("Java", t, arr);
        t.roll(arr);
        course.show();
    }
}
