package sort;

import java.util.Arrays;

/**
 * Created by ilya on 28-Feb-17.
 */
public class MergeSort {
    /**
     * This method sorts input array in-place using merge sort algorithm
     * @param input array to sort
     */
    public void doMergeSort(int[] input) {
        doRecursiveMergeSort(input, 0, input.length - 1);
    }

    private void doRecursiveMergeSort(int[] input, int left, int right) {
        System.out.println("starting to sort " + Arrays.toString(input) + "(" + left + ", " + right + ")");

        if (left == right){
            System.out.println("array is already sorted, returning");
            return;
        }

        int middle = (left + right) / 2;

        doRecursiveMergeSort(input, left, middle);
        doRecursiveMergeSort(input, middle + 1, right);
        merge(input, left, middle, right);
        System.out.println("finished sorting " + Arrays.toString(input));

    }

    private void merge(int[] input, int left, int middle, int right) {
        System.out.println("merge (" + left + ", " + middle + ", " + right + ")");

        int[] res = new int[right - left + 1];
        int current_res_idx = 0;

        if (onlyTwoElementsToMerge(left, right)){
            if (input[right] < input[left]){
                int tmp = input[left];
                input[left] = input[right];
                input[right] = tmp;
            }
            return;
        }

        int current_left_idx = left;
        int current_right_idx = middle + 1;

        while (current_left_idx <= middle || current_right_idx <= right){
            int currentLeftValue = (current_left_idx <= middle) ? input[current_left_idx] : Integer.MAX_VALUE;
            int currentRightValue = (current_right_idx <= right) ? input[current_right_idx] : Integer.MAX_VALUE;
            if (current_right_idx > right || (currentLeftValue <= currentRightValue)){
                res[current_res_idx] = currentLeftValue;
                current_left_idx++;
            } else if ( current_left_idx > middle || (currentLeftValue > currentRightValue)){
                res[current_res_idx] = currentRightValue;
                current_right_idx++;
            }
            current_res_idx++;
        }
        System.arraycopy(res, 0, input, left, res.length);
    }

    private boolean onlyTwoElementsToMerge(int left, int right) {
        return right - left == 1;
    }
}