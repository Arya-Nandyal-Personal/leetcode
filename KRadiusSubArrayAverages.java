import java.util.Arrays;
/**
 *Method finds the maximum subarray sum of unique elements in a given array
 * @param nums The array of values of type int that are passed in
 * @param k 
 * @return an arraylist containing the greatest elements
 */
public class KRadiusSubArrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length]; int temp = 0;
        Arrays.fill(ans, -1);
        for(int i = k; i + k < nums.length; i++) {
            long avg = 0;
            for(int j = i - k; j <= i + k; j++) {
                avg += nums[j];
            }
            ans[i] = (int)(avg/(2*k + 1));
        }
        return ans;
    }
}
