package com.day09.universitydigitalrecordsystem;

import java.util.ArrayList;
import java.util.List;

class BST {
    private Node root;

    public BST() {
        root = null;
    }

    
    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private Node insertRec(Node root, Student student) {
        if (root == null) {
            return new Node(student);
        }

        int cmp = student.rollNumber.compareTo(root.data.rollNumber);

        if (cmp < 0) {
            root.left = insertRec(root.left, student);
        } else if (cmp > 0) {
            root.right = insertRec(root.right, student);
        }
        
        return root;
    }

    
    public void delete(String rollNumber) {
        root = deleteRec(root, rollNumber);
    }

    private Node deleteRec(Node root, String rollNumber) {
        if (root == null) {
            return null;
        }

        int cmp = rollNumber.compareTo(root.data.rollNumber);

        if (cmp < 0) {
            root.left = deleteRec(root.left, rollNumber);
        } else if (cmp > 0) {
            root.right = deleteRec(root.right, rollNumber);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            
            root.data = minValueNode(root.right).data;
            root.right = deleteRec(root.right, root.data.rollNumber);
        }
        return root;
    }

    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Scenario 3: Search
    public Student search(String rollNumber) {
        Node node = searchRec(root, rollNumber);
        return (node != null) ? node.data : null;
    }

    private Node searchRec(Node root, String rollNumber) {
        if (root == null || root.data.rollNumber.equals(rollNumber)) {
            return root;
        }

        int cmp = rollNumber.compareTo(root.data.rollNumber);

        if (cmp < 0) {
            return searchRec(root.left, rollNumber);
        }
        return searchRec(root.right, rollNumber);
    }

    
    public List<Student> getSortedStudents() {
        List<Student> students = new ArrayList<>();
        inorder(root, students);
        return students;
    }

    private void inorder(Node root, List<Student> students) {
        if (root != null) {
            inorder(root.left, students);
            students.add(root.data);
            inorder(root.right, students);
        }
    }

    
    public void printInOrder() {
        printInOrderRec(root);
        System.out.println();
    }

    private void printInOrderRec(Node root) {
        if (root != null) {
            printInOrderRec(root.left);
            System.out.println(root.data);
            printInOrderRec(root.right);
        }
    }
}