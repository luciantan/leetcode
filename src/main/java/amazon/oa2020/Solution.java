package amazon.oa2020;

import java.util.LinkedList;

public class Solution {

    protected static final boolean SOLUTION_DONE = true;
    /**
     * @return: an integer
     */

    private class Point {
        int row;
        int column;

        //constructor
        public Point(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }


    public int zombie(int[][] grid) {
        // write your code here
        LinkedList<Point> queue = new LinkedList();
        boolean isEmpty = true;
        for(int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == 1) {
                    queue.offer(new Point(row, column));
                }
                if (grid[row][column] != 0) {
                    isEmpty = false;
                }
            }
        }
        if (isEmpty) {
            return 0;
        }

        int result = -1;

        int[] rowDirections = {1, -1, 0, 0};
        int[] columnDirections = {0, 0, 1, -1};
        while (queue.size() != 0) {

            int length = queue.size();

            for (int i = 0; i < length; i++) {
                Point point = queue.poll();
                //上下左右
                for (int j = 0; j < 4; j++) {
                    int row = point.row + rowDirections[j];
                    int column = point.column + columnDirections[j];
                    if (row < 0 || row > grid.length - 1 || column < 0 || column > grid[0].length - 1) {
                        continue;
                    }
                    if (grid[row][column] == 0) {
                        queue.offer(new Point(row, column));
                        grid[row][column] = 1;
                    }
                }
            }

            result++;
        }

        for(int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == 0) {
                    return -1;
                }
            }
        }


        return result;

    }
}
