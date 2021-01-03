package amazon.mostFrequent50.a139_wordBreak;

import java.util.HashMap;
import java.util.List;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    HashMap<String, Boolean> map = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }
        for (String word : wordDict) {
            if (s.startsWith(word) && wordBreak(s.substring(word.length()), wordDict)) {
                return true;
            }
        }
        map.put(s, false);
        return false;
    }

}
