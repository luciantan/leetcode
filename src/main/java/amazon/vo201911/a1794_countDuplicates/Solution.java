package amazon.vo201911.a1794_countDuplicates;
//1794. Count Duplicates
//        中文English
//        Given an array of integers, your task is to count the number of duplicate array elements. Duplicate is defined as two or more identical elements. For example, in the array[1, 2, 2, 3, 3, 3],the two twos are one duplicate and so are the three threes.you need return an array including every non-unique(duplicate) values in the numbers array (with the same order of given array).
//
//        Example
//        Example 1:
//
//        Input: nums = [1, 2, 2, 3, 3, 3]
//        Output: [2, 3]
//        Example 2:
//
//        Input: array = [1, 2, 3]
//        Output: []
//        Notice
//        The array returned is ordered in the order of the Numbers that satisfy the original array.
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param nums: a integer array
     * @return: return an integer denoting the number of non-unique(duplicate) values
     */
    public List<Integer> CountDuplicates(List<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap();

        LinkedList<Integer> result = new LinkedList();
        for (int number : nums) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
                if (map.get(number) == 2) {
                    result.offer(number);
                }
            } else {
                map.put(number, 1);
            }
        }

        return result;
    }
}
