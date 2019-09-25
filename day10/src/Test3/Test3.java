package Test3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<User> arr = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            arr.add(new User(i));
        }
        System.out.println("未分组:");
        System.out.println(arr);

        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();
        r1.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= 10 && u.getId() < 20)
                    u.setType("v1");
            }
        });
        r2.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId() >= 20 && u.getId() < 30)
                    u.setType("v2");
            }
        });
        for (int i = 0; i < arr.size(); i++) {
            User user=arr.get(i);
            r1.reception(user);
            r2.reception(user);
            r3.reception(user);
        }
        System.out.println("已分组:");
        for (int i = 0; i < arr.size(); i++) {
            User user = arr.get(i);
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(user + " \t");
        }
    }
}
