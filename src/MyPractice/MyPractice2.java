package MyPractice;

public class MyPractice2 {
    public static void main(String[] args) {

        int[] arrValues = {20, 65, -22, 4, 65, 10, 2, 56, 21};

        for (int i = 0; i < arrValues.length - 1; i++) {
            int temp;
            for (int j = 0; j < arrValues.length - 1; j++) {
                if (arrValues[j] > arrValues[j + 1]) { // to make descending order just change > with <
                    temp = arrValues[j];
                    arrValues[j] = arrValues[j + 1];
                    arrValues[j + 1] = temp;
                }
            }
        }
        for (int result: arrValues) {
            System.out.println(result);
        }
    }
}
