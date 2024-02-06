package balabux.production;

import java.util.Arrays;

public class BubbleSort {

    static void sort(int[] array) {
        boolean completed;
        for (int i = 0; i < array.length - 1; i++) {
            completed = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    completed = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (completed) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,9,4,9,5,6};
        sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
