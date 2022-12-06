package com.learning.microservices.coreconcepts.binarysearchtrees;

public class Tree {
    private TreeNode rootNode;

    public void insert(int value){
        if(null == rootNode) rootNode = new TreeNode(value);
        rootNode.insert(value);
    }

    public void traverseInOrder() {
        if(null != rootNode)
            rootNode.traverseInOrder();
    }

    public TreeNode get(int value) {
        if(null != rootNode) {
            return rootNode.get(value);
        }
        return null;
    }

    public int min() {
        if(null == rootNode) return Integer.MIN_VALUE;
        else return rootNode.min();
    }
    public int max() {
        if(null == rootNode) return Integer.MAX_VALUE;
        else return rootNode.max();
    }

    public void delete(int value) {
        rootNode = delete(rootNode, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        else {
            // Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            }
            else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            // Case 3: node to delete has 2 children
            // Replace the value in the subtreeRoot node with the smallest value
            // from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }

        return subtreeRoot;
    }
}
