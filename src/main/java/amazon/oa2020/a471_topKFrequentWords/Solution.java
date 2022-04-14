package amazon.oa2020.a471_topKFrequentWords;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//471. Top K Frequent Words
//        中文English
//        Given a list of words and an integer k, return the top k frequent words in the list.
//
//        Example
//        Example 1:
//
//        Input:
//        [
//        "yes", "lint", "code",
//        "yes", "code", "baby",
//        "you", "baby", "chrome",
//        "safari", "lint", "code",
//        "body", "lint", "code"
//        ]
//        k = 3
//        Output: ["code", "lint", "baby"]
//        Example 2:
//
//        Input:
//        [
//        "yes", "lint", "code",
//        "yes", "code", "baby",
//        "you", "baby", "chrome",
//        "safari", "lint", "code",
//        "body", "lint", "code"
//        ]
//        k = 4
//        Output: ["code", "lint", "baby", "yes"]
//        Challenge
//        Do it in O(nlogk) time and O(n) extra space.
//
//        Notice
//        You should order the words by the frequency of them in the return list, the most frequent one comes first. If two words has the same frequency, the one with lower alphabetical order come first.
public class Solution {
    protected static final boolean SOLUTION_DONE = true;

    /**
     * @param words: an array of string
     * @param k: An integer
     * @return: an array of string
     */
    public String[] topKFrequentWords(String[] words, int k) {
        // write your code here
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new myComparator());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k ) {
                pq.poll();
            }
        }

        String[] result = new String[pq.size()];

        System.out.println(pq.size());
        int i = pq.size() - 1;
        while(!pq.isEmpty()) {

            result[i] = pq.poll().getKey();
            i--;
        }

        return result;
    }

    class myComparator implements Comparator<Map.Entry<String, Integer>>{
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            if (o1.getValue() == o2.getValue()) {
                return o2.getKey().compareTo(o1.getKey());
            } else {
                return o1.getValue() - o2.getValue();
            }
        }
    }
}
