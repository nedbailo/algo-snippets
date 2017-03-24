package sort;

import java.util.Arrays;

/**
 * Created by ilya on 24-Mar-17.
 */
public class InsertionSort {
    public void doInsertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0 && input[j] < input[j - 1]; j--) {
                System.out.print("input[" + j + "] < input[" + (j - 1) + "] (" +  input[j] + " < " + input[j - 1] + ")"  );
                swap(input, j, j - 1);
                System.out.println(Arrays.toString(input));
            }
        }
    }

    private void swap(int[] input, int i, int j) {
        int tmp = input[j];
        input[j] = input[i];
        input[i] = tmp;
    }
}
