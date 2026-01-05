package com.hashmaps.customhashmap;


class HashNode {
	
    int key;
    int value;
    HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
