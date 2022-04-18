package microsoft.oa5;

import java.util.HashMap;
import java.util.Map;

//
// https://leetcode.com/problems/cinema-seat-allocation/
//        A cinema has n rows of seats, numbered from 1 to n and there are ten seats in each row, labelled from 1 to 10 as shown in the figure above.
//
//        Given the array reservedSeats containing the numbers of seats already reserved, for example, reservedSeats[i] = [3,8] means the seat located in row 3 and labelled with 8 is already reserved.
//
//        Return the maximum number of four-person groups you can assign on the cinema seats. A four-person group occupies four adjacent seats in one single row. Seats across an aisle (such as [3,3] and [3,4]) are not considered to be adjacent, but there is an exceptional case on which an aisle split a four-person group, in that case, the aisle split a four-person group in the middle, which means to have two people on each side.
public class Solution {

    protected static final boolean SOLUTION_DONE = true;

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int left = 0b11110000;
        int middle = 0b11000011;
        int right = 0b00001111;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int[] seat : reservedSeats) {
            if (seat[1] >= 2 && seat[1] <= 9) {
                int origin = map.getOrDefault(seat[0], 0);
                int updated = origin | (1 << seat[1] - 2);  //把1左移这么多次，表示这一位座位被占了
                map.put(seat[0], updated);
            }
        }

        int result = (n - map.size()) * 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int row = entry.getKey();
            int bitmask = entry.getValue();
            if ((bitmask | left) == left || (bitmask | middle) == middle || (bitmask | right) == right) {
                result++;
            }
        }

        return result;
    }
}
