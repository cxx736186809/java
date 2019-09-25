package Test2.T_2.Test3;

/*
1. 写一个方法实现用户登陆，传入用户名和密码
2. 如果用户名错误，就抛出自定义登陆异常(LoginException)，异常信息为用户名不存在。
3. 如果密码错了就也抛出登陆异常,异常信息为密码错误
4. 如果用户名和密码都对了,输出: 欢迎xxx
说明：正确用户名和密码都是admin
 */
public class Test3 {
    public static void main(String[] args) {
        login("da", "da");
        login("admin", "da");
        login("admin", "admin");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String name=sc.nextLine();
//        if (!name.equals("admin"))
//            throw new LoginException("用户名不存在");
//        else {
//            System.out.println("请输入密码：");
//            String pw=sc.nextLine();
//            if (!pw.equals("admin"))
//                throw new LoginException("密码错误");
//            else
//                System.out.println("欢迎admin");
//        }
    }

    public static void login(String name, String pwd) {

        if (!name.equals("admin"))
            throw new LoginException("用户名不存在");
        else {
            if (!pwd.equals("admin"))
                throw new LoginException("密码错误");
            else
                System.out.println("欢迎admin");
        }
    }
}

