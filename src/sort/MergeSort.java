package sort;

import java.util.Arrays;

/**
 * Created by ilya on 28-Feb-17.
 */
public class MergeSort {
    /**
     * This method sorts input array in-place using recursive merge sort algorithm
     *
     * @param input array to sort
     */
    public void doMergeSort(int[] input) {
        System.out.println("starting to sort " + Arrays.toString(input));
        doRecursiveMergeSort(input, 0, input.length - 1);
        System.out.println("finished sorting " + Arrays.toString(input));

    }

    private void doRecursiveMergeSort(int[] input, int left, int right) {
        System.out.println("-- sorting (" + left + ", " + right + ")");

        if (left == right) {
            System.out.println("-- array is already sorted, returning");
            return;
        }

        int middle = (left + right) / 2;

        doRecursiveMergeSort(input, left, middle);
        doRecursiveMergeSort(input, middle + 1, right);
        merge(input, left, middle, right);
    }

    private void merge(int[] input, int left, int middle, int right) {
        int[] res = new int[right - left + 1];

        int current_left_idx = left;
        int current_right_idx = middle + 1;

        for (int i = 0; i < res.length; i++) {
            if (current_left_idx > middle) {
                res[i] = input[current_right_idx++];
            } else if (current_right_idx > right) {
                res[i] = input[current_left_idx++];
            } else if (input[current_left_idx] <= input[current_right_idx]) {
                res[i] = input[current_left_idx++];
            } else if ((input[current_left_idx] > input[current_right_idx])) {
                res[i] = input[current_right_idx++];
            }
        }
        System.arraycopy(res, 0, input, left, res.length);
        System.out.println("-- merged (" + left + ", (" + middle + "), " + right + ")");
    }
}