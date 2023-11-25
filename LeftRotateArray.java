public class LeftRotateArray {
    /**
     * Moves each of the elements one space to the left and the first element to the end of the array
     * @param arr an array of ints
     */
    public static void rotate(int[] arr){
        if(arr == null || arr.length == 0 || arr.length == 1){
            return;
        }
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        rotate(nums);
        for(int i: nums){
            System.out.print(i + " ");
        }
    }
}
