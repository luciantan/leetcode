package amazon.mostFrequent50.a295_findMedianFromDataStream;

import java.util.PriorityQueue;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    PriorityQueue<Integer> minStack;
    PriorityQueue<Integer> maxStack;

    /** initialize your data structure here. */
    public Solution() {
        minStack = new PriorityQueue<Integer>();
        maxStack = new PriorityQueue<Integer>((a, b) -> (b - a));
    }

    public void addNum(int num) {
        if (minStack.size() < maxStack.size()) {
            maxStack.offer(num);
            minStack.offer(maxStack.poll());
        } else {
            minStack.offer(num);
            maxStack.offer(minStack.poll());
        }
    }

    public double findMedian() {
        if (maxStack.size() == minStack.size()) {
            return (maxStack.peek() + minStack.peek()) * 0.5;
        } else {
            return maxStack.peek();
        }
    }
}
