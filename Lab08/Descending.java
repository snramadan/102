/*
 * Descending 
 *
 * @author Saba Ramadan
 * @version Lab 08
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;

public class Descending implements Comparator<Integer>
{
    //compares the items and places them in descending order
    public int compare(Integer o1, Integer o2)
    {
        if (o1 < o2)
           return 1;
        if (o1 == o2)
           return 0;
        return -1;
    }
}


