package Test2;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        boolean isMirror = true;
        for (int i = 0,j=arr.length-1; i <=j; i++,j--)
            if (arr[i] != arr[j]) {
                isMirror = false;
                break;
            }
        System.out.println("{1,2,3,4,3,2,1}是否对称：" + isMirror);
    }
}


