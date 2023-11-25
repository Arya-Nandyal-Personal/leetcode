public class LeftRotateArrayDPieces {
    /**
     * Moves the elements of the array to the left a user specified number of spaces
     * @param arr an array of ints
     * @param d the number of times the elements are rotated
     */
    public static void leftRotate(int[] arr, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length -1);
    }

    /**
     * A method that reverses the elements of the array based on user specification
     * @param arr the array passed into the method with elements of type int
     * @param low the smallest element being reversed
     * @param high the largest element being reversed
     */
    public static void reverse(int[] arr, int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3 ,4, 5, 6, 7, 8};
        leftRotate(nums, 2);
        for(int i: nums){
            System.out.print(i + " ");
        }
    }
}
