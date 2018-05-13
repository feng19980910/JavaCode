import java.util.ArrayList;
import java.util.Random;

public class ProduceWithLatest3 {
    // the names of the function and the variable can be the same, without conflict
    private static ArrayList<Integer> cpuList = new ArrayList<Integer>();
    public static ArrayList<Integer> cpuList(int cpuData) {
        int i = cpuList.size();
        if (i < 3) {
            cpuList.add(cpuData);
        } else {
            cpuList.remove(0);
            cpuList.add(cpuData);
        }
        System.out.println(cpuList);
        return cpuList;
    }
    public static void main(String [] args) {
        for (int i = 0; i < 20; i++) {
            Random rd = new Random();
            int a = rd.nextInt(100);
            System.out.println(a);
            cpuList(a);
        }
    }
}