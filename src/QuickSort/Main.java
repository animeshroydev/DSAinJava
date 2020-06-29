package QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 55, 23, -35, 16, 2, 6 };

        quickSort(intArray, 0, intArray.length);

        for (int value : intArray) {
            System.out.print(value + " ");
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex); // Left array
        quickSort(input, pivotIndex + 1, end); // right array
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // Right to left swapping
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // Left to right swapping
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }
}