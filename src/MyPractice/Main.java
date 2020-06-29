package MyPractice;

public class Main {
    public static void main(String[] args) {

        int[] arrValues = {20, 65, -22, 4, 65, 10, 2, 56, 21};

        for (int i = arrValues.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrValues[j] > arrValues[j + 1]) {
                    swap(arrValues, j, j + 1);
                }
            }
        }
        for (int result: arrValues) {
            System.out.println(result);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        if (i == j) {
            return;
        }
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
