package amazon.mostFrequent50.a380_insertDeleteGetRandomO1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random random;

    /** Initialize your data structure here. */
    public Solution() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        map.remove(val);
        int lastVal = list.remove(list.size() - 1);
        if (index != list.size()) {
            list.set(index, lastVal);
            map.put(lastVal, index);
        }
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
