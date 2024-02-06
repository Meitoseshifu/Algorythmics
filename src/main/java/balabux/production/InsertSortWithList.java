package balabux.production;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertSortWithList {
    public static void main(String[] args) {
        List<Integer> list = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(1000))
                .limit(20)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);
        insertionSort(list);
        System.out.println(list);
    }

    private static void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i - 1;
            int current = list.get(i);
            while (j >= 0 && list.get(j) > current) {
                list.set(j+1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, current);
        }
    }
}
