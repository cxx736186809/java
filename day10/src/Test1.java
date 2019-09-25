public class Test1 {
    public static void main(String[] args) {
        String str = "23.23456789";
        int count = 3;
        System.out.println("原数字字符串:" + str);
        HandleAble h1 = new HandleAble() {

            @Override
            public String HandleString(String num) {
                return num.substring(0, num.indexOf("."));
            }
        };
        String s1 = h1.HandleString(str);
        System.out.println("取整后:" + s1);

        HandleAble h2 = new HandleAble() {

            @Override
            public String HandleString(String num) {
                int i = num.indexOf(".") + count + 1;
                char c = num.charAt(i);
                if (c <= '4')
                    return num.substring(0,i-1);
                else {
                    char c1= (char) (num.charAt(num.indexOf(".")+count)+1);
                    return num.substring(0,i-1)+c1;
                }
            }
        };
        String s2 = h2.HandleString(str);
        System.out.println("保留" + count + "位小数后:" + s2);
    }
}


interface HandleAble {
    public abstract String HandleString(String num);
}