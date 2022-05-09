package tiktok.oa1;

import java.util.LinkedList;

public class Solution {
    protected static final boolean SOLUTION_DONE = true;

    public int numberInfected(int numberHouse, int[] infected) {

        boolean[] visited = new boolean[numberHouse];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i< infected.length; i++) {
            queue.add(infected[i]);
            visited[infected[i]] = true;
        }
        int currentInfected = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int number = queue.pollFirst();
                if (number - 1 >= 0 &&  visited[number - 1] == false) {
                    visited[number - 1] = true;
                    queue.add(number - 1);
                }
                if (number + 1 < numberHouse && visited[number + 1] == false) {
                    visited[number + 1] = true;
                    queue.add(number + 1);
                }
            }
            currentInfected *= permulation(queue.size());
        }

        return currentInfected;
    }

    private int permulation (int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
