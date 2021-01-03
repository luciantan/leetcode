package amazon.mostFrequent50.a973_kClosestPointsToOrigin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new myComparator());

        for (int i = 0; i < points.length; i++) {
            pq.offer(points[i]);
            if (pq.size() > K) {
                System.out.println(pq.peek()[0] + ":" + pq.peek()[1]);
                pq.poll();
            }
        }

        int[][] result = new int[K][2];
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            // System.out.println(pq.peek()[0] + ":" + pq.peek()[1]);
            result[i] = pq.poll();
        }

        return result;
    }

    class myComparator implements Comparator<int[]> {
        public int compare(int[] point1, int[] point2) {
            return (point2[0] * point2[0] + point2[1] * point2[1] - point1[0] * point1[0] - point1[1] * point1[1]);
        }
    }
}
