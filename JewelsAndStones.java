import java.util.Map;
import java.util.HashMap;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for(char jewel: jewels.toCharArray()) map.put(jewel, 0);
        for(char stone: stones.toCharArray()) {
            if(map.get(stone) != null) {
                map.put(stone, map.getOrDefault(stone, 0) + 1);
            }
        }
        int count = 0;
        for(char key: map.keySet()) {
            count += map.get(key);
        }
        return count;
    }
}
