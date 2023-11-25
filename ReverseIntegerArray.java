public class ReverseIntegerArray {
    /**
     * Reverses the contents of an array
     * @param arr an array with elements of type int
     */
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
