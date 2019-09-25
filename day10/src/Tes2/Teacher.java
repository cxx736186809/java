package Tes2;

import java.util.ArrayList;

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void roll(ArrayList<Student> arr){
        for (int i = 0; i < arr.size(); i++) {
            Student student = arr.get(i);
            if (!student.getName().equals("小明")) {
                student.setAttendance(true);
            }
        }
    }
}
