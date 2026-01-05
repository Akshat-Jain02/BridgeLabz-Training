package com.hashmaps.customhashmap;

class CustomHashMap {
	
    private final int SIZE = 1000;
    private HashNode[] buckets;

    public CustomHashMap() {
        buckets = new HashNode[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        HashNode head = buckets[index];

        if (head == null) {
            buckets[index] = new HashNode(key, value);
            return;
        }

        HashNode curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value; // update
                return;
            }
            if (curr.next == null) break;
            curr = curr.next;
        }
        curr.next = new HashNode(key, value); // insert at end
    }

    public int get(int key) {
        int index = hash(key);
        HashNode curr = buckets[index];
        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        HashNode curr = buckets[index];
        HashNode prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
