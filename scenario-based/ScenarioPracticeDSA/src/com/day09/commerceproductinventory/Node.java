package com.day09.commerceproductinventory;

class Node {
	
    Product data;
    Node left;
    Node right;

    Node(Product data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}