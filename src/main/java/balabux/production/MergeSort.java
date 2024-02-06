package balabux.production;

import java.util.Arrays;

public class MergeSort {
    void sort(int[] array, int left, int right) {
        if (right > left) {
            int middle = left + (right - left) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    void merge(int[] array, int left, int middle, int right) {
        int[] leftSubArray = new int[middle - left + 1];
        int[] rightSubArray = new int[right - middle];

        System.arraycopy(array, left, leftSubArray, 0, leftSubArray.length);
        System.arraycopy(array, middle + 1, rightSubArray, 0, rightSubArray.length);

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
        int[] array = {1,8,9,4,3,5,5,6,5,1,2,50,46};
        MergeSort mergeSort = new MergeSort();

        System.out.println(Arrays.toString(array));
        mergeSort.sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
