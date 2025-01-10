package balabux.production;

public class BinarySearch {
    int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[middle] == target) return middle;

            if (arr[middle] < target) { // If x greater, ignore left half
                left = middle + 1;
            } else { // If x is smaller, ignore right half
                right = middle - 1;
            }
        }
        // If we reach here, then element was not present
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = { 2, 3, 4, 10, 40 };
        int target = 10;
        int result = ob.binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }

}
