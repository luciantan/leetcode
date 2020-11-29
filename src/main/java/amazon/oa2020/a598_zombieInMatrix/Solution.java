package amazon.oa2020.a598_zombieInMatrix;

import java.util.LinkedList;

//598. Zombie in Matrix
//        中文English
//        Given a 2D grid, each cell is either a wall 2, a zombie 1 or people 0 (the number zero, one, two).
//        Zombies can turn the nearest people(up/down/left/right) into zombies every day, but can not through wall. How long will it take to turn all people into zombies?
//        Return -1 if can not turn all people into zombies.
//
//        Example
//        Example 1:
//
//        Input:
//        [[0,1,2,0,0],
//        [1,0,0,2,1],
//        [0,1,0,0,0]]
//        Output:
//        2
//        Example 2:
//
//        Input:
//        [[0,0,0],
//        [0,0,0],
//        [0,0,1]]
//        Output:
//        4

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
