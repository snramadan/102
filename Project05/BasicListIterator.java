/*
 * DES
 *
 * @author Saba Ramadan
 * @version Project 05
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.*;

public interface BasicListIterator<E> extends java.util.Iterator<E>
{
    public boolean hasPrevious();
    public E previous();
}

