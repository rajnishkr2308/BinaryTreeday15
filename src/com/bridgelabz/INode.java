package com.bridgelabz;

    public class Node<T extends Comparable<T>> {
        /*
        Initializing
         */
        T data;
        Node<T> nextL;
        Node<T> nextR;

        public Node(T data) {
        /*
        Parameterized Constructor
         */
            this.data = data;
        }
    }

