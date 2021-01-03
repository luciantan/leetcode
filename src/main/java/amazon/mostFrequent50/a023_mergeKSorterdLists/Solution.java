package amazon.mostFrequent50.a023_mergeKSorterdLists;

import java.util.PriorityQueue;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((node1, node2) -> node1.val - node2.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.offer(lists[i]);
            }
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while (!pq.isEmpty()) {
            current.next = pq.poll();
            if (current.next.next != null) {
                pq.offer(current.next.next);
            }
            current = current.next;
        }

        return dummy.next;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
