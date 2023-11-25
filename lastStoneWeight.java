import java.util.Comparator;
import java.util.PriorityQueue;

public class lastStoneWeight {
    public int getStoneWeight(int[] stones) {
        PriorityQueue<Integer> weigh = new PriorityQueue<>(Comparator.reverseOrder());
        for (int weight : stones) weigh.add(weight);
        while (weigh.size() >= 2) {
            int first = weigh.remove();
            int second = weigh.remove();
            if (first != second) weigh.add(first - second);
        }
        return (weigh.size() == 1) ? weigh.remove() : 0;
    }
}
