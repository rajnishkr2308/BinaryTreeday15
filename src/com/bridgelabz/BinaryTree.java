package com.bridgelabz;
    public class BinaryTree <T extends Comparable<T>> {

        Node<T> root;

        public void add(T data) {
            /*
             * Adding the new node.
             * when the root is null, then create a new node.
             */
            Node<T> newNode = new Node<>(data);
            if (root == null) {
                root = newNode;
                return;
            }
            /*
             * When the current pointer is in the root;
             * the value is less than zero, the current pointer is next to left
             * when the value is less , the current pointer creates the new node next to left
             */
            Node<T> currentPointer = root;
            while (true) {
                if (data.compareTo(currentPointer.data) < 0) {
                    if (currentPointer.nextL == null) {
                        currentPointer.nextL = newNode;
                        return;
                    }
                    currentPointer = currentPointer.nextL;
                    /*
                     * the value is greater than zero, the current pointer is next to right
                     * when the value is greater , the current pointer creates the new node next to right
                     */
                } else {
                    if (currentPointer.nextR == null) {
                        currentPointer.nextR = newNode;
                        return;
                    }
                    currentPointer = currentPointer.nextR;
                }
            }
        }
        public void display(Node<T> currentPointer){

            if (currentPointer == null)
                return;
            display(currentPointer.nextL);
            System.out.print(currentPointer.data+" ");
            display(currentPointer.nextR);
        }
    }

