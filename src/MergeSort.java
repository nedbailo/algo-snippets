import java.util.Arrays;

/**
 * Created by ilya on 28-Feb-17.
 */
public class MergeSort {

    public void doMergeSort(int[] input) {
        recursiveMergeSort(input, 0, input.length - 1);
    }

    private void recursiveMergeSort(int[] input, int start, int end) {
        System.out.println("sorting: " + Arrays.toString(input) + " start = " + start + " end = " + end);


        //if array of 1 element then it is already sorted
        if (start == end){
            System.out.println(" -- range already sorted");
            return;
        }

        if (start < end){
            int mid = (start + end) / 2;
            recursiveMergeSort(input, start, mid);
            recursiveMergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
            System.out.println(" -- sorted : " + Arrays.toString(input) + " start = " + start + " end = " + end);
        }
    }

    //TODO: try first merge into aux array and then copy back, maybe the code will be easier
    private void merge(int[] input, int start, int mid, int end) {
        int[] tmp = Arrays.copyOfRange(input, start, end + 1);
        System.out.println(" -- created aux array n = " + tmp.length);

        //indexes in tmp array
        int tmpLeft = 0;
        int tmpMid = mid - start;
        int tmpRight = tmpMid + 1;
        int tmpEnd = end - start;

        //merging into [start..end] part of the original array
        for (int i = start; i <= end; i++){
            if ((tmpRight > tmpEnd) || (tmpLeft <= tmpMid && (tmp[tmpLeft] <= tmp[tmpRight]))){
                input[i]= tmp[tmpLeft];
                tmpLeft++;
            } else if ((tmpLeft > tmpMid) || (tmpRight <= tmpEnd && (tmp[tmpLeft] > tmp[tmpRight]))){
                input[i]= tmp[tmpRight];
                tmpRight++;
            }
        }
    }
}
