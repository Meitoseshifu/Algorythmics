package balabux.production;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class DemoApp {
    public static void main(String[] args) {
        int[] array = {1,8,9,4,3,5,5,6,5,1,2};
        System.out.println(Arrays.toString(array));
        MergeSortTask mergeSortTask = new MergeSortTask();
        mergeSortTask.init(array);
        ForkJoinPool.commonPool().invoke(mergeSortTask);
        System.out.println(Arrays.toString(array));
    }


}
