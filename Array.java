import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    static int[] ar;
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

        System.out.println(Arrays.toString(ar));

        // test methods of Arrays.deepToString(type[][])
        int arr_2d[][] = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(arr_2d));

        ArrayList<ArrayList<String>> arrlist_2d = new ArrayList<ArrayList<String>>();
        ArrayList<String> arrlista_1d = new ArrayList<String>();
        ArrayList<String> arrlistb_1d = new ArrayList<String>();
        arrlist_2d.add(arrlista_1d);
        arrlist_2d.add(arrlistb_1d);
        arrlista_1d.add("abc");
        arrlista_1d.add("def");
        arrlistb_1d.add("ghi");
        arrlistb_1d.add("jkl");
        arrlist_2d.get(0).add("abc");
        arrlist_2d.get(0).add("def");
        arrlist_2d.get(1).add("ghi");
        arrlist_2d.get(1).add("jkl");
        // System.out.println(Arrays.deepToString(arrlist_2d));
        System.out.println(arrlist_2d);
        return;
    }
}