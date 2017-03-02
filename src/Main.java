import com.sun.scenario.effect.Merge;
import problems.MedianOfThree;
import sort.MergeSort;

import java.util.Arrays;

/**
 * Created by ilya on 01-Mar-17.
 */
public class Main {

    public static void main(String[] args) {
        //int[] input = {6, 4, 2, 1, 3, 5, 7, 9, 1, 1, 8};
//        int[] input = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println("input : " + Arrays.toString(input));

//        new SelectionSort().doSelectionSort(input);
//        int res = new search.BinarySearch().rank(99, input);
//        System.out.println("rank is " + res);

        //new SelectionSort().doSelectionSort(input);
//        new MergeSort().doMergeSort(input);
//        System.out.println("sorted: " + Arrays.toString(input));

        int[] three = {3, 1, 6};
        int res = new MedianOfThree().getMedianUsingSort(three[0], three[1], three[2]);
        System.out.println(Arrays.toString(three) + " median " + res);
    }

}
