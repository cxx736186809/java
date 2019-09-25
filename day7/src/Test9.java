import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("bca");
        arr.add("dadfa");
        arr.add("dddaaa");
        arr.add("你好啊");
        arr.add("我来啦你干嘛呢");
        arr.add("别跑啊");

        System.out.println("源ArrayList：" + arr);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > 4){
                arr.remove(i);
                i--;
            }
        }
        System.out.print("删除后ArrayList：" + arr);
    }
}
