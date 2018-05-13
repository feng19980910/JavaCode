// THE ARRAY IS A POINTER
// go away that java has no pointers!!
import java.util.Arrays;

public class ArrayCopy {
    static int a[] = {};
    public static void main(String[] args) {
        int b[] = {1, 2, 3};
        a = b;
        a[0] = 0;
        System.out.println(Arrays.toString(b));
    }
}