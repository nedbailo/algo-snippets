import com.sun.scenario.effect.Merge;

import java.util.Arrays;

/**
 * Created by ilya on 01-Mar-17.
 */
public class Main {

    public static void main(String[] args) {
        int[] input = {6, 4, 2, 1, 3, 5, 7, 9, 1, 1, 8};
        System.out.println("input : " + Arrays.toString(input));

        //new SelectionSort().doSelectionSort(input);
        new MergeSort().doMergeSort(input);

        System.out.println("sorted: " + Arrays.toString(input));
    }

}
