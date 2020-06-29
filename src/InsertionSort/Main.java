package InsertionSort;

public class Main {

    public static void main(String[] args) {

        int[] arrList = {5, 4, 10, 1, 6, 2};

        for (int i = 1; i < arrList.length; i++) {
            int temp = arrList[i];
            int j = i - 1;
            while (j >= 0 && arrList[j] > temp) {
                arrList[j + 1] = arrList[j];
                j--;
            }
            arrList[j + 1] = temp;
        }
        for (int res: arrList) {
            System.out.println(res);
        }
    }
}
