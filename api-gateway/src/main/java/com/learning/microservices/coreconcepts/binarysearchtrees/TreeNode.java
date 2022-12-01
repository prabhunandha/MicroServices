package com.learning.microservices.coreconcepts.binarysearchtrees;


import lombok.Data;

@Data
public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int val){
        if(data == val) return;
        if(val < data) {
            if(null == leftChild){
                leftChild = new TreeNode(val);
            } else {
                leftChild.insert(val);
            }
        } else {
            if(null == rightChild) {
                rightChild = new TreeNode(val);
            } else {
                rightChild.insert(val);
            }
        }
    }

    public void traverseInOrder() {
        if(null != leftChild){
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if(null != rightChild) {
            rightChild.traverseInOrder();
        }
    }

//    public String toString() {
//        return "Data = " + data;
//    }

    public TreeNode get(int value) {
        if(data == value) return this;

        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        } else {
            if(rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min() {
        if(leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }
    public int max() {
        if(rightChild == null) {
            return data;
        } else {
            return rightChild.max();
        }
    }
}
