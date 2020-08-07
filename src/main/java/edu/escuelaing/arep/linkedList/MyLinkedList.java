package edu.escuelaing.arep.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList <L> implements List<L> {
    private Node<L> head;
    private int size;

    /**
     * Construtor linkedList
     */
    public MyLinkedList(){
        this.size = 0;
        this.head = null;
    }

    @Override
    public boolean add(L data ){
        size++;
        Node<L> newNode = new Node<L>( data );
        if(head == null){
            head = newNode;
        } else {
            Node<L> lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<L> iterator() {
        final Iterator<L> iterator = new Iterator<L>() {
            Node<L> initialNode = head;
            @Override
            public boolean hasNext() {
                return initialNode != null;
            }

            @Override
            public L next() {
                L data = initialNode.getData();
                initialNode = initialNode.next;
                return data;
            }

            @Override
            public void remove() {
            }
        };

        return iterator;
    }

    @Override
    public L remove(int index) {
        if (index == 0) {
            L element = head.data;
            head = head.next;
            return element;
        } else {
            Node<L> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            L element = current.next.data;
            current.next = current.next.next;
            return element;
        }
    }



    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Collection<? extends L> c) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(int index, Collection<? extends L> c) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remove(Object o) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() { throw new java.lang.UnsupportedOperationException("Not supported yet.");}

    @Override
    public L get(int index) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public L set(int index, L element) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(int index, L element) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int indexOf(Object o) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator<L> listIterator() {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator<L> listIterator(int index) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<L> subList(int fromIndex, int toIndex) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(Object o) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object[] toArray() {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Permite ver los elementos de la linkedlist
     */
    public void printMyLinkedList(){
        Node<L> nodeCurrent = head;
        while (nodeCurrent != null){
            System.out.println(nodeCurrent.getData() + " ");
            nodeCurrent = nodeCurrent.next;
        }
    }
}