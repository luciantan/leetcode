package amazon.mostFrequent50.a253_meetingRooms2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        // sort with start time
        Arrays.sort(intervals, (interval1, interval2) -> {return interval1[0] - interval2[0];});

        // everytime, we need to find the earliest ending time, so use priority queue to get the earlist ending time
        PriorityQueue<Integer> pq = new PriorityQueue<>((endTime1, endTime2) -> {return endTime1 - endTime2;});

        // add the end time of the first meeting
        pq.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= pq.peek()) {
                pq.poll();
            }
            pq.offer(intervals[i][1]);
        }

        return pq.size();

    }
}
