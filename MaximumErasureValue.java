import java.util.Set;
import java.util.HashSet;

/**
 *Method finds the maximum subarray sum of unique elements in a given array
 * @param nums The array of values of type int that are passed in
 * @return the int value of the max subarray sum
 */

public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int l = 0; int r = 0; int maxSum = 0; int sum = 0;
        while(r < nums.length) {
            if(set.contains(nums[r])) {
                maxSum = Math.max(sum, maxSum);
                while(set.contains(nums[r]) && l < nums.length) {
                    set.remove(nums[l]);
                    sum -= nums[l];
                    l++;
                }
            }
            set.add(nums[r]);
            sum += nums[r];
            r++;
        }
        return Math.max(sum, maxSum);
    }
}
