package Test2;

public class Test7 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = new int[]{1, 2, 3, 5, 3, 2, 1};
        System.out.println("是否对称：" + equals(arr1, arr2));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }
}


