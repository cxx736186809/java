package Tes1.T_2;
/*
编写一个泛形方法名称为swap，实现指定位置数组元素的交换.数组和要交换的索引作为方法参数
 */
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
       String[] arr1={"a","b","c"};
       swap(arr1,0,2);
       Integer[] a={1,2,3};
       swap(a,0,2);
    }

    public static <T> void swap(T[] arr, int a, int b) {
        System.out.println("交换前："+Arrays.toString(arr));
        T temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println("交换后："+Arrays.toString(arr));
    }
}
