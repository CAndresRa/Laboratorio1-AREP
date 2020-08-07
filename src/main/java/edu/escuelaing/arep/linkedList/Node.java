package edu.escuelaing.arep.linkedList;

public class Node <T> {
    Node<T> next;
    T data;

    /**
     * Constructor of Node
     * @param data value of node
     */
    public Node (T data){
        this.next = null;
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }
}