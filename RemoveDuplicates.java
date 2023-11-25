import java.util.Arrays;

public class RemoveDuplicates {
    /**
     * Identifies and moves duplicate values in an array to the back of the array
     * @param arr an array of ints
     * @return the last element that does not contain duplicate elements in the array
     */
    public static int removeDuplicates(int[] arr) {
        if (arr == null) {
            return -1;
        }
        if (arr.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 1;
        while (fast < arr.length) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
        return slow;
    }
    public static String toString(int[] arr) {
        return Arrays.toString(arr);
    }
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 3, 3, 4};
        System.out.println("Original Array: " + toString(nums));
        removeDuplicates(nums);
        System.out.println("Revised Array: " + toString(nums));

    }
}
