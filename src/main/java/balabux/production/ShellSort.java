package balabux.production;

import java.util.Arrays;

public class ShellSort {
    static void sort(int[] array) {
        for (int gap = array.length/2; gap > 0; gap = gap/2) {
            for (int i = gap; i < array.length; i++) {
                int current = array[i];
                int j;
                
                for (j = i; j >= gap && array[j - gap] > current; j = j - gap) {
                    array[j] = array[j - gap];
                }
                array[j] = current;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,0,1,8,7,2,5,4,8,6};
        sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    void sort2(int[] array) {
        // Start with a big gap, then reduce the gap
        for (int gap = array.length/2; gap > 0; gap = gap/2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < array.length; i++)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = array[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j = j - gap) {
                    array[j] = array[j - gap];
                }

                // put temp (the original a[i]) in its correct
                // location
                array[j] = temp;
            }
        }
    }
}
