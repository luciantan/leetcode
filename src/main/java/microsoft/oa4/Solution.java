package microsoft.oa4;

// Given an integer N, returns the maximum possible value obtainable by deleting one '5' digit from N. N has at least one '5' and two digits.
// e.g. N=15958 return 1958 N = -5859 return -589  解法是遍历整个list,find max
public class Solution {
    protected static final boolean SOLUTION_DONE = true;

    //use String
    public int findLargeNum(int num) {

        StringBuilder sb = new StringBuilder(Integer.toString(num));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '5') {
                sb.deleteCharAt(i);
                max = Math.max(max, Integer.valueOf(sb.toString()));
                sb.insert(i, '5');
            }
        }
        return max;
    }
}
