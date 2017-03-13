package problems;

import java.util.Arrays;

/**
 * Created by ilya on 3/2/2017.
 */
public class MedianOfThree {
    public int getMedian(int a, int b, int c){
        if (a < b){
            a ^= b;
            b ^= a;
            a ^= b;
        }
        if (a < c){
            a ^= c;
            c ^= a;
            a ^= c;
        }
        if (b < c){
            b ^= c;
            c ^= b;
            b ^= c;
        }
        return b;
    }

    public int getMedianUsingSort(int a, int b, int c){
        int[] array = {a, b, c};
        Arrays.sort(array);
        return array[1];
    }
}
