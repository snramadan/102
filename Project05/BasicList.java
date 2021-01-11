/*
 * Basic List
 *
 * @author Saba Ramadan
 * @version Project 05
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;

public interface BasicList<E> extends java.lang.Iterable<E>
{
    //adds the specified element to the end of list
    public void add(E element);

    //add element at specfied index
    public void add(int index, E element);
 
    //Returns a reference to a BasicListIterator over the elements in this list in the proper sequence (first-to-last order)
    public BasicListIterator<E> basicListIterator();
    
    //clears list
    public void clear();

    //checks if certain element is in list
    public boolean contains(E element);

    //returns element at index
    public E get(int index);

    //returns index of specified element
    public int indexOf(E element);

    //Returns a reference to a java.util.Iterator over the elements of this list in the proper sequence (first-to-last order)
    public java.util.Iterator<E> iterator();

    //removes at certain index
    public E remove(int index);

    //sets element at specified index
    public E set(int index, E element);

    //returns size of list
    public int size();
}
