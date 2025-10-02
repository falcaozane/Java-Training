package searchAlgorithms;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int steps = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            steps++;

            if (target == nums[mid]) {
                System.out.println("No. of Steps required: " + steps);
                return mid;
            } else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("No. of Steps required: " + steps);
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 9;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
