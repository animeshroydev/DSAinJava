package ShellSort;

public class Main {
    public static void main(String[] args) {

        /*
        Code logic:
        1. We'll base our gap on the array's length. We'll initialize the gap (or interval) to array.length / 2
        2. On each iteration, we'll divide the gap value by 2 to get the next gap value until we hit 1.
        3. For our array, the gap value will be init to 4.
        4. First iteration we use the value 4 second we use 4 and in final iteration we gonna use 1 - Insertion sort.
         */

        int[] newArray = {2, 7, 9, 5, 23, 29, 15, 19, 31}; // n = 9

        for (int gap = newArray.length / 2; gap >= 1; gap = gap / 2) {

            for (int j = gap; j < newArray.length; j++) {

                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (newArray[i + gap] > newArray[i]) {
                        break;
                    } else {
                        int temp = newArray[i];
                        newArray[i] = newArray[i + gap];
                        newArray[i + gap] = temp;
                    }
                }
            }
        }
        for (int res : newArray) {
            System.out.print(res + " ");
        }
    }
}
