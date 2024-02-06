package balabux.production;

import java.util.Arrays;

public class SelectSort {

    static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int next = array[j];
                if (current > next) {
                    array[j] = current;
                    current = next;
                }
            }
            array[i] = current;
        }
    }

    public static void main(String[] args) {
        int[] array = {8,9,7,4,6,5,6,1,4};
        sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
