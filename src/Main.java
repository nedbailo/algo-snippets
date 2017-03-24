import sort.BubbleSort;
import sort.MergeSort;
import sort.TwoEndSort;

import java.util.Arrays;

/**
 * Created by ilya on 01-Mar-17.
 */
public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 3, 4, 6, 6, 9};

        System.out.println("sorting: " + Arrays.toString(input));
        new BubbleSort().doBubbleSort(input);
        System.out.println("sorted: " + Arrays.toString(input));


//        new MergeSort().doMergeSort(input);
//        System.out.println("sorted: " + Arrays.toString(input));
//        int[] input = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println("input : " + Arrays.toString(input));

//        new SelectionSort().doSelectionSort(input);
//        int res = new search.BinarySearch().rank(99, input);
//        System.out.println("rank is " + res);

        //new SelectionSort().doSelectionSort(input);

//        int[] three = {5, 4, 4};
//        int res = new MedianOfThree().getMedianUsingSort(three[0], three[1], three[2]);
//        System.out.println(Arrays.toString(three) + " median " + res);
//        boolean unique = new AllUniqueChars().checkIfAllUniqueUsingSetWithoutAdditionalDataStructures("ab  cc");
//        System.out.println("unique " + unique);
    }

}
