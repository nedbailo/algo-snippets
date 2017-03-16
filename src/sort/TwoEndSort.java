package sort;

import java.util.Arrays;

/**
 * Created by ilya on 16-Mar-17.
 */
public class TwoEndSort {
    public void doSort(int[] input) {

        for (int i = 0, j = input.length - 1; i <= j; i++, j--) {
            int minValue = input[i];
            int maxValue = input[i];
            int minIndex = i;
            int maxIndex = i;

            for (int n = i + 1; n <= j; n++) {

                if (input[n] <= minValue) {
                    minValue = input[n];
                    minIndex = n;
                }
                if (input[n] >= maxValue) {
                    maxValue = input[n];
                    maxIndex = n;
                }
            }

            swap(input, minIndex, i, maxIndex, j);

            System.out.println(i + " " + j + " min " + minValue + " max " + maxValue + "arr " + Arrays.toString(input));
        }
    }

    private void swap(int[] input, int minFrom, int minTo, int maxFrom, int maxTo) {
        if (minFrom == maxFrom) {
            return;
        }
        if (minFrom == maxTo && maxFrom == minTo) {
            swap(input, minFrom, maxFrom);
            return;
        }
        swap(input, minFrom, minTo);
        swap(input, maxFrom, maxTo);
    }

    private void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
}
