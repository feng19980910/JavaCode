import java.util.Arrays;

public class DynamicInsert {
    static int a[] = {};

    public static void main(String [] args) {
        a = insertint(a, 5);
        System.out.println(Arrays.toString(a));
    }

    private static int[] insertint(int arr[], int num) {
        int size = arr.length;
        int tmp[] = new int[size + 1];
        System.arraycopy(arr, 0, tmp, 0, size);
        tmp[size] = num;
        return tmp;
    }
}