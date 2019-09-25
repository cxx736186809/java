import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//        int score=80;
//        String name = s.nextLine();
//        System.out.println(ival + "," + name);
        System.out.println("请输入成绩：");
        Scanner s = new Scanner(System.in);

        int score = s.nextInt();
        if (score < 0 && score >=100) {
            System.out.println("成绩有误");
        } else if (score < 100 && score >=90) {
            System.out.println("优秀");
        } else if (score < 90 && score >=80) {
            System.out.println("好");
        } else if (score < 80 && score >=70) {
            System.out.println("良");
        } else if (score < 70 && score >=60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

}
