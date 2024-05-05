import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static double findRatio(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        int largest = list.remove(list.size() - 1);
        int secondLargest = list.remove(list.size() - 1);
        int smallest = list.remove(0);
        int secondSmallest = list.remove(0);

        return (largest + secondLargest) / (double)(smallest + secondSmallest);
    }

    public static void main(String[] args) {
        int[] num = {3,5,12,450,1,1,5,6,8,9,321,2,3};
        System.out.println(findRatio(num));
    }
}
