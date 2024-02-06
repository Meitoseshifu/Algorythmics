package balabux.production;

import java.util.Arrays;

@SuppressWarnings(value = "all")
public class TempDemo {

    private static final int START = 0;

    /**
     * 0, 4
     * 0, 2
     * 0, 1
     * 0, 0
     * 1, 1
     * 2, 2
     * 3, 4
     */
    private void sort(int[] array, int left, int right) {
        if (right > left) {
            int middle = left + (right - left) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
        int[] leftSubArray = new int[middle - left + 1];
        int[] rightSubArray = new int[right - middle];

        System.arraycopy(array, left, leftSubArray, START, leftSubArray.length);
        System.arraycopy(array, middle + 1, rightSubArray, START, rightSubArray.length);

        int leftIndex = 0;
        int rightIndex = 0;
        int mergeIndex = left;

        while (leftIndex < leftSubArray.length && rightIndex < rightSubArray.length) {
            if (leftSubArray[leftIndex] > rightSubArray[rightIndex]) {
                array[mergeIndex] = rightSubArray[rightIndex++];
            } else {
                array[mergeIndex] = leftSubArray[leftIndex++];
            }
            mergeIndex++;
        }

        System.arraycopy(leftSubArray, leftIndex, array, mergeIndex, leftSubArray.length - leftIndex);
        System.arraycopy(rightSubArray, rightIndex, array, mergeIndex, rightSubArray.length - rightIndex);
    }

    public static void main(String[] args) {
        int [] array = new int[] {4,8,3,2,4,9,8,7,2,6};
        /*int [] array = new int[] {54, 34, 12, 3, 2};

        System.out.println(Arrays.toString(array));

        TempDemo mergeSort = new TempDemo();
        mergeSort.sort(array, START, array.length - 1);

        System.out.println(Arrays.toString(array));*/

        if( isOneTime(array) || isSecondTime(array) && isThird(array)) {
            System.out.println("Hello");
        }
    }

    private static boolean isThird(int[] array) {
        System.out.println("IsThird");
        return false;
    }

    private static boolean isSecondTime(int[] array) {
        System.out.println("IsSecond");
        return true;
    }

    private static boolean isOneTime(int[] array) {
        System.out.println("isOne");
        return false;
    }
}
