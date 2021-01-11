/*
 * Basic List Iterator
 *
 * @author Saba Ramadan
 * @version Project 05
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;

public interface BasicListIterator<E> extends java.util.Iterator<E>
{
    //Returns true if the iterator has a previous element
    public boolean hasPrevious();

    //Returns the previous element and moves the iterator backward one position
    public E previous();
}

