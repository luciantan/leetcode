package amazon.oa2020.a165_mergeTwoSortedList;

import cn.hjmao.utils.list.ListNode;

//165. Merge Two Sorted Lists
//        中文English
//        Merge two sorted (ascending) linked lists and return it as a new sorted list.
//        The new sorted list should be made by splicing together the nodes of the two lists and sorted in ascending order.
//
//        Example
//        Example 1:
//        Input: list1 = null, list2 = 0->3->3->null
//        Output: 0->3->3->null
//
//
//        Example 2:
//        Input:  list1 =  1->3->8->11->15->null, list2 = 2->null
//        Output: 1->2->3->8->11->15->null


public class Solution {

    protected static final boolean SOLUTION_DONE = true;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;

        }

        return dummy.next;
    }
}
