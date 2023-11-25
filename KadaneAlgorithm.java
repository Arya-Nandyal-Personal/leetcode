public class KadaneAlgorithm {
    /**
     * Finding the maximum sum of a contigious subarray
     * @param arr array containing int values
     * @return the max sum of the contigious subarray based on the array passed in
     */
    public static int maxSubArraySum(int[] arr){
        int maxSum = arr[0];
        int currSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currSum = Math.max(arr[i], arr[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
