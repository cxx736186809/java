import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
    int sum=0;
    for(int i=1;i<101;i++){
        if (i%2!=0){
            sum=sum+i;
        }
    }
        System.out.println("1-100的技术累加和："+sum);
    }

}
