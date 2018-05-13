import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    static int arr0[] = { 3, 4, 5 };
    public static void main(String [] Args) {
        // followed by default array
        int arr[] = {1, 2, 3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr);    // what is this mean?
        System.out.println(Arrays.toString(arr));
        System.out.println(arr0);   // and this.

        // followed by ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 100);
        System.out.println(list);
        // System.out.println(list[1]);
        // System.out.println(list[2]);
        // System.out.println(list[3]);

        return;
    }
}