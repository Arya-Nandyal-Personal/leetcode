import java.util.Objects;
import java.util.PriorityQueue;

class Point{
    public int x;
    public int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Point)){
            return false;
        }
        return ((Point) obj).x == this.x && ((Point) obj).y == this.y;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.x, this.y);
    }
}
public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> heap = new PriorityQueue<>((point2, point1) ->
                Double.compare(Math.sqrt(point1.x * point1.x + point1.y * point1.y),
                        Math.sqrt(point2.x * point2.x + point2.y * point2.y)));

        int[][] ans = new int[k][2];

        for(int i = 0; i < points.length; i++) {
            heap.add(new Point(points[i][0], points[i][1]));
            if(heap.size() > k) heap.remove();
        }

        int index = 0;
        while(!heap.isEmpty()) {
            Point point = heap.remove();
            ans[index][0] = point.x;
            ans[index][1] = point.y;
            index++;
        }
        return ans;
    }
}
