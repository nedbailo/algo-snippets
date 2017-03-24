package sort;

import java.util.Arrays;

/**
 * Created by ilya on 24-Mar-17.
 */
public class BubbleSort {
    public void doBubbleSort(int[] input) {
        for (int n = input.length; n > 0; n--) {
            for (int i = 0; i < n - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int tmp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = tmp;
                    System.out.println(" -- " + Arrays.toString(input));
                }
            }
        }
    }
}
