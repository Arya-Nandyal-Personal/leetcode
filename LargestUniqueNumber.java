import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) map.put(i, map.getOrDefault(i, 0) + 1);
        int max = -1;
        for(int key: map.keySet()) {
            if(map.get(key) == 1 && key > max) max = key;
        }
        return max;
    }
}
