/**
 * Created by ilya on 01-Mar-17.
 */
public class BinarySearch {
    public int rank(int key, int[] array){
        return recursiveRank(key, array, 0, array.length - 1);
    }

    private int recursiveRank(int key, int[] array, int lo, int hi){
        int mid = (lo + hi) / 2;
        System.out.println("searching in " + lo + ".." + hi + " mid=" + mid);
        if (lo == hi){
            if (array[lo] == key){
                return lo;
            } else {
                return -1;
            }
        }
        if (array[mid] == key){
            return mid;
        } else if (array[mid] < key) {
            return recursiveRank(key, array, mid + 1, hi);
        } else {
            return recursiveRank(key, array, lo, mid - 1 );
        }
    }
}
