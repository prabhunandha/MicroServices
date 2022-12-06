package com.learning.microservices.coreconcepts.maxheaps;

public class Heap {

    private int[] heap;
    private int size;


    public Heap(int capacity){
        heap = new int[capacity];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        return heap[0];
    }

    public void insert(int value){
        if(isFull()) throw new ArrayIndexOutOfBoundsException("heap is full!!!");

        heap[size] =value;
        fixHeapAbove(size);
        size++;
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        int parentIndex = getParent(index);

        while (index > 0 && newValue > heap[parentIndex]) {
            heap[index] = heap[parentIndex];
            index = parentIndex;
        }
         heap[index] = newValue;
    }
    public int delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        }
        else {
            fixHeapAbove(index);
        }

        size--;

        return deletedValue;

    }
    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                }
                else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                }
                else {
                    break;
                }

                index = childToSwap;
            }
            else {
                break;
            }
        }
    }

    public void sort() {
        int lastHeapIndex = size - 1;
        for (int i = 0; i < lastHeapIndex; i++) {
            int tmp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = tmp;

            fixHeapBelow(0, lastHeapIndex - i - 1);
        }
    }
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
    public boolean isEmpty() {
        return size == 0;
    }

    private int getParent(int index){
        return (index-1) / 2;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public int getSize(){
        return heap.length;
    }

    public boolean isFull(){
        return size == heap.length;
    }

}
