package tiktok.oa3;

import java.util.*;
//import java.util.List;

public class Solution {
    protected static final boolean SOLUTION_DONE = true;

    public int getMaxDistance(HashMap<Integer, List<Integer>> graph) {

        HashSet<Integer> aSet = new HashSet<>();
        aSet.add(1);
        aSet.add(2);
        aSet.add(3);

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);

        HashSet<Integer> visited = new HashSet<>();
        visited.add(4);
        visited.add(5);
        visited.add(6);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level += 1;
            for (int i = 0; i < size; i++) {
                int number = queue.pollFirst();
                System.out.println(number);
                for (int connectedNumber : graph.get(number)) {
                    if (!visited.contains(connectedNumber)) {
                        visited.add(connectedNumber);
                        queue.add(connectedNumber);
                    }
                }
            }

        }

        return level - 1;
    }
}
