package amazon.vo201911.a38_searchA2DMetrix2;
//38. Search a 2D Matrix II
//        中文English
//        Write an efficient algorithm that searches for a value in an m x n matrix, return the occurrence of it.
//
//        This matrix has the following properties:
//
//        Integers in each row are sorted from left to right.
//        Integers in each column are sorted from up to bottom.
//        No duplicate integers in each row or column.
//        Example
//        Example 1:
//
//        Input:
//        [[3,4]]
//        target=3
//        Output:1
//        Example 2:
//
//        Input:
//        [
//        [1, 3, 5, 7],
//        [2, 4, 7, 8],
//        [3, 5, 9, 10]
//        ]
//        target = 3
//        Output:2
//        Challenge
//        O(m+n) time and O(1) extra space
public class Solution {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }

        //from bottom left to top right
        int n = matrix.length;
        int m = matrix[0].length;
        int x = n - 1;
        int y = 0;
        int count = 0;

        while (x >= 0 && y < m) {
            if (matrix[x][y] < target) {
                y++;
            } else if (matrix[x][y] > target) {
                x--;
            } else {
                count++;
                x--;
                y++;
            }
        }
        return count;
    }
}
