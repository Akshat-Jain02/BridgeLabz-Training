package com.day09.commerceproductinventory;

class ProductBST {
	
    private Node root;

    public ProductBST() {
        root = null;
    }

    
    public Product find(String sku) {
        Node current = root;
        while (current != null) {
            int cmp = sku.compareTo(current.data.sku);
            if (cmp == 0) {
                return current.data;
            }
            current = (cmp < 0) ? current.left : current.right;
        }
        return null;
    }

    
    public void addOrUpdate(Product product) {
        root = addOrUpdateRec(root, product);
    }

    private Node addOrUpdateRec(Node node, Product product) {
        if (node == null) {
            return new Node(product);
        }

        int cmp = product.sku.compareTo(node.data.sku);

        if (cmp == 0) {
            
            node.data = product;
            return node;
        }

        if (cmp < 0) {
            node.left = addOrUpdateRec(node.left, product);
        } else {
            node.right = addOrUpdateRec(node.right, product);
        }

        return node;
    }

    
    public void printSorted() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }

    
    public boolean exists(String sku) {
        return find(sku) != null;
    }
}