package amazon.mostFrequent50.a200_numberOfIslands;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

//    DFS
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;

    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }

//    BFS
//    public int numIslands(char[][] grid) {
//        int result = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == '1') {
//                    result ++;
//                    disappear(grid, i, j);
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(grid));
//        return result;
//    }
//    private void disappear(char[][] grid, int iIndex, int jIndex) {
//        LinkedList<int[]> queue = new LinkedList();
//        int[] startPoint = {iIndex, jIndex};
//        queue.offer(startPoint);
//        int[] xDirection = {1, -1, 0, 0};
//        int[] yDirection = {0, 0, 1, -1};
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                int[] currentPoint = queue.poll();
//                for (int j = 0; j < 4; j++) {
//                    int[] newPoint = new int[2];
//                    newPoint[0] = currentPoint[0] + xDirection[j];
//                    newPoint[1] = currentPoint[1] + yDirection[j];
//                    if (newPoint[0] < 0 || newPoint[0] > grid.length - 1 || newPoint[1] < 0 || newPoint[1] > grid[0].length - 1) {
//                        continue;
//                    }
//                    System.out.println(Arrays.toString(newPoint));
//                    if (grid[newPoint[0]][newPoint[1]] == '1') {
//                        queue.offer(newPoint);
//                        grid[newPoint[0]][newPoint[1]] = '0';
//                    }
//                }
//            }
//        }
//    }

}
