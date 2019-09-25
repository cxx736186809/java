public class Test6 {
    public static void printString(){
        int num=69;
        String str;
        str=num%2==0?"偶数":"奇数";
        System.out.println("num:"+num+str);
    }
    public static void main(String[] args) {

        printString();
    }
}

