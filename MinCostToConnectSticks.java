import java.util.PriorityQueue;

public class MinCostToConnectSticks {
    public int connectSticks(int[] sticks) {
        int minSum = 0; PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int stick: sticks) minHeap.add(stick);
        while(minHeap.size() != 1) {
            int first = minHeap.remove();
            int second = minHeap.remove();
            minSum += first+second;
            minHeap.add(first + second);
        }
        return minSum;
    }
}
