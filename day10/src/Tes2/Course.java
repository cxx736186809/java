package Tes2;

import java.util.ArrayList;

public class Course {
    private String course;//名称
    Teacher t = new Teacher();
    ArrayList<Student> arr = new ArrayList<>();

    public Course(String course, Teacher t, ArrayList<Student> arr) {
        this.course = course;
        this.t = t;
        this.arr = arr;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    public ArrayList<Student> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Student> arr) {
        this.arr = arr;
    }

    public void show() {
        System.out.println("课程名称:" + course);
        System.out.println("授课老师:" + t.getName());
        for (int i = 0; i < arr.size(); i++) {
            Student student = arr.get(i);
            String name= student.getName();
            if (student.isAttendance()) {
                System.out.println("上\t 课:" + name);
            }else {
                System.out.println("旷\t 课: " + name);
            }
        }
    }
}
