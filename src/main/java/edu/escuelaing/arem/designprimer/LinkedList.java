package edu.escuelaing.arem.designprimer;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Implementation of LinkedList
 * @author eduardo.ocampo
 */
public class LinkedList implements List {

    private int size;
    private Node first;
    private Node last;
    
    
    /**
     * This is the constructor of the class LinkedList
     */
    public LinkedList(){
        this.size = 0;
        first = null;
        last = null;
    }
    
    /**
     * Class Node used by the LinkedList.
     */
    private static class Node<AnyType> {
        private AnyType data;
        private Node<AnyType> next;
        private Node<AnyType> prior;
        
        /**
         * This is the constructor of the class Node
         * @param data Data of the node of the linkedlist.
         * @param prior Last node created.
         */
        public Node(AnyType data, Node<AnyType> prior) {
            this.data = data;
            this.next = null;
            this.prior = prior;
        }
    }

    /**
     * This method add a node to a LinkedList.
     * @param o This object is the actual value of the node
     * @return if the add was performed.
     */
    public boolean add(Object o) {
        Node newNode;
        if (size == 0){
            newNode = new Node(o,null);
            first = newNode;
            last = newNode;
            size =+ 1;
            return true;
        }else{
            newNode = new Node(o,last);
            last.next = newNode;
            last = newNode;
            this.size = this.size + 1;
            return true;
        }
    }

    /**
     * This method give the size of the linkedList
     * @return Size of the list.
     */
    public int size() {
        return this.size;
    }
    
    /**
     * This method tell if the list is empty
     * @return a boolean that tell if the list is empty.
     */
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }
    
    /**
     * This method get a value of a node in an exact index
     * @param index The place of the value want to get
     * @return The value that correspond to the index
     */
    public Object get(int index) {
        Node answer = first;
        for (int i = 0; i < index; i++) {
            answer = answer.next;
        }
        return answer.data;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return size - 1;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
    
    /**
     * This method is used to compare between 2 LinkedList and see if they are equal.
     * @param list The list that want to compare
     * @return A boolean that represent if both of the lists are equal.
     */
    public boolean equals(LinkedList list){
        if (this.size() == list.size()){
            for (int i = 0; i < this.size(); i++){
                if(this.get(i) != list.get(i)){
                    return false;
                }
            }
            return true;
        }else{            
            return false;
        } 
    }
}