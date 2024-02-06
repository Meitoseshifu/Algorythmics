import java.util.Arrays;
import java.util.stream.Stream;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && arr[j] >= current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,7,9,9,1,5,2,6,2,3,8,2,7,6,5};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
