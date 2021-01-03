package amazon.mostFrequent50.a146_LRUCache;

import java.util.HashMap;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    private HashMap<Integer, DoubleLinkedNode> map = new HashMap<Integer, DoubleLinkedNode>();
    private int size;
    private int capacity;
    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    // constructor
    public Solution(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DoubleLinkedNode();
        tail = new DoubleLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    // interface 1: get
    public int get(int key) {
        DoubleLinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    // interface 2: put
    public void put(int key, int value) {
        DoubleLinkedNode node = map.get(key);
        if (node == null) {
            node = new DoubleLinkedNode(key, value);
            map.put(key, node);
            addToHead(node);
            size++;
            if (size > capacity) {
                DoubleLinkedNode tail = removeTail();
                map.remove(tail.key);
                size--;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private class DoubleLinkedNode {
        int key;
        int value;
        DoubleLinkedNode prev;
        DoubleLinkedNode next;
        public DoubleLinkedNode(){};
        public DoubleLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private void addToHead(DoubleLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode (DoubleLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DoubleLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DoubleLinkedNode removeTail() {
        DoubleLinkedNode result = tail.prev;
        removeNode(result);
        return result;
    }

}
