package UsingJDK;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrList = {5, 4, 10, 1, 6, 2};

        // modified version of quick sort
        // Arrays.sort(arrList);

        // combination of merge sort and quick sort
        Arrays.parallelSort(arrList);

        for (int result : arrList) {
            System.out.print(result + " ");
        }
    }
}
