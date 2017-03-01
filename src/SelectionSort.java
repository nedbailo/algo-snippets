/**
 * Created by ilya on 28-Feb-17.
 */
public class SelectionSort {

    public void doSelectionSort(int[] input){
        for (int i = 0; i < input.length - 1; i++){
            int minIndex = getIndexOfSmallestRemainingElement(input, i);
            swapElements(i, minIndex, input);
        }
    }

    private void swapElements(int i, int minIndex, int[] input) {
        int tmp = input[i];
        input[i] = input[minIndex];
        input[minIndex] = tmp;
    }

    private int getIndexOfSmallestRemainingElement(int[] input, int i) {
        int currentMinIndex = i;
        int currentMin = input[i];
        for (int j = i+1; j < input.length - 1; j++)
            if (currentMin > input[j]){
                currentMin = input[j];
                currentMinIndex = j;
            }
        return currentMinIndex;
    }
}
