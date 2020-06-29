package MyPractice;

public class PracticeSelectionSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22}; // length = 7

        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (intArray[j] > intArray[largest]) {
                    largest = j;
                }
            }
            swap(intArray, largest, i);
        }
        for (int res: intArray) {
            System.out.println(res);
        }
    }

    public static void swap(int[] inArray, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = inArray[i];
        inArray[i] = inArray[j];
        inArray[j] = temp;
    }
}
