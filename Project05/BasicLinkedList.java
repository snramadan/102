/*
 * Basic Linked List
 *
 * @author Saba Ramadan
 * @version Project 05
 * @version CPE102-05
 * @version Fall 2016
 */

import java.lang.Object;
import java.util.*;

public class BasicLinkedList<E> implements BasicList<E>
{
    //instance variables
    private Node head;
    private int size;
    private Node tail;

    //Constructs an empty BasicLinkedList
    public BasicLinkedList()
    {
         size = 0;
         head = null; 
         tail = null;  
    }
 
    //Adds the element passed in to the end of the list
    public void add(E element)
    {
        Node newNode = new Node(element);
        if (size == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }  
        size++;
    }

    //Adds (inserts) the specfied element at the specfied index of the list
    public void add(int index, E element)
    {
        if (index > size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (size == 0)
        {
            head = newNode;
            tail = newNode;
            size++;
        }
        else if (index == 0)
        {   
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
        else if (index == size)
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
        else
        {
            Node p = getNode(index-1);
            newNode.prev = p;
            p.next.prev = newNode;
            newNode.next = p.next;
            p.next = newNode;
            size++;
        }
    }

    //Returns a reference to a BasicListIterator over the elements in this list in the proper sequence (first-to-last order)
    public BasicListIterator<E> basicListIterator()
    {
        return new BasicLinkedIterator();          
    }
 
    //Clears the list of its contents without walking the list
    public void clear()
    {
        head = null;
        tail = null;
        size = 0;
    }

    //Using the provided element's equals method, this method determines if the list contains the specified element or not
    public boolean contains(E element)
    {
        boolean cont = false;
        Node p = head;
        while (cont == false && p != tail.next)
        {
            if (p.element == null && element == null)
            {
                 cont = true;
            }
            else if (p.element == null && element != null)
            {
                 cont = false;
            }
            else if (p.element.equals(element))
            {
               cont = true;
            }
            p = p.next;
        }
        return cont;
    }
   
    //Returns a reference to the element at the specified index
    public E get(int index)
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node p = getNode(index);
        return p.element;
    }
 
    //Using the provided element's equals method, this method returns the index of the first element in the list that is equal to the provided element, if any.
    public int indexOf(E element)
    {
        if (head == null)
        {
            throw new NoSuchElementException();
        }
        int index = 0;
        Node p = head;
        while (p != null)
        {   
            if (p.element == null && element == null || p.element.equals(element))
            {  
               return index;
            }
            p = p.next;
            index++;
        }
        if (index >= size || index < 0)
        {
            throw new NoSuchElementException();
        }
        return index;
    }
 
    //Returns a reference to a java.util.Iterator over the elements of this list in the proper sequence (first-to-last order)
    public java.util.Iterator<E> iterator()
    {  
        return new BasicLinkedIterator(); 
    }
  
    //Removes (and returns) the specified element from the list
    public E remove(int index)
    {
        if (head == null || index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node rp = null;
        Node p = getNode(index);
        if (size == 1)
        {
            rp = head;
            head = null;
            tail = null;
            size = 0;
        }
        else if (index == 0)
        {
            rp = head;
            head = head.next;
            head.prev = null;
            size--;
        }
        else if (index == size-1)
        {
            rp = tail;
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        else
        {
            rp = p;
            p.prev.next = p.next;
            p.next.prev = p.prev;
            p = null;
            size--;
        }
        return rp.element;
    }

    //Replaces the element at the specified index with the specified element
    public E set(int index, E element)
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node p = getNode(index);
        E e = p.element;
        p.element = element;
        return e;      
    }
 
    //returns number of elements 
    public int size()
    { 
        return size;
    }

    //returns node at given int position
    private Node getNode(int i)
    {
        Node p = head;
        int pos = 0;
        if (i <= size/2)
        {
           while (pos != i)
           {
               p = p.next;
               pos++;
           }
        }
        else
        {
            p = tail;
            pos = size-1;
            while (pos != i)
            {
               p = p.prev;    
               pos--;
            }
        }
        return p;
    }

    //private node class
    private class Node
    {
        //instnce variables
        public E element;
        public Node next;
        public Node prev;
 
        //constructor that sets instance variables
        public Node(E element)
        {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    //private inner class 
    private class BasicLinkedIterator implements BasicListIterator<E>
    {
         //instance variable
         private Node current;
         private Node previous;
 
         //constructor sets current to head
         public BasicLinkedIterator()
         {
       	     current = head;
         }
 
         //checks if has next node
         public boolean hasNext()
         {
             return current != null;
         }
 
         //returns the node that comes next
         public E next()
         {
             if (!hasNext())
             {
                 throw new NoSuchElementException();
             }
             else 
             {
                 E e = current.element;
                 previous = current;
                 current = current.next;
                 return e;
             }
         }

         //removes node
         public void remove()
         {
             throw new UnsupportedOperationException();
         }

         //returns previous node
         public E previous()
         {
             if (!hasPrevious())
             {
                 throw new NoSuchElementException();
             }
             else
             {
                 E e = previous.element;
                 current = previous;
                 previous = previous.prev;
                 return e;
             }
         }

         //checks if node has a previous node
         public boolean hasPrevious()
         {
             return previous != null;
         }
 
    }
}
