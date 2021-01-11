/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 05
 * @version CPE102-09
 * @version Spring 2016
 */

import java.lang.Object;
import java.util.*;

public class BasicLinkedList<E> implements BasicList<E>
{
    private Node head;
    private int size;
    private Node tail;

    public BasicLinkedList()
    {
         size = 0;
         head = null; 
         tail = null;  
    }
 
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

    public BasicListIterator<E> basicListIterator()
    {
        return new BasicLinkedIterator();          
    }
 
    public void clear()
    {
        head = null;
        tail = null;
        size = 0;
    }

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
 
    public E get(int index)
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node p = getNode(index);
        return p.element;
    }
 
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
 
    public java.util.Iterator<E> iterator()
    {  
        return new BasicLinkedIterator(); 
    }
  
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
 
    public int size()
    { 
        return size;
    }
  
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

    private class Node
    {
        public E element;
        public Node next;
        public Node prev;
 
        public Node(E element)
        {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    private class BasicLinkedIterator implements BasicListIterator<E>
    {
         private Node current;
         private Node previous;
 
         public BasicLinkedIterator()
         {
       	     current = head;
         }
 
         public boolean hasNext()
         {
             return current != null;
         }
 
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

         public void remove()
         {
             throw new UnsupportedOperationException();
         }

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

         public boolean hasPrevious()
         {
             return previous != null;
         }
 
    }
}
