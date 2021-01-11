/*
 * Odd Even Descending
 *  
 * @author Saba Ramadan
 * @version Lab 08
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.*;

public class OddEvenDescending implements Comparator<Integer>
{
    //compares the items and places them in odd even descending order
    public int compare(Integer o1, Integer o2)
    {
        if (o1%2 == 0 && o2%2 == 0)
        {
            if (o1 < o2)
            {
                return 1;
            }
            if (o1 == o2)
            {
                return 0;
            }
            return -1;
        }
        if (o1%2 != 0 && o2%2 != 0)
        {
            if (o1 < o2)
            {
                return 1;
            }
            if (o1 == o2)
            {
                return 0;
            }
            return -1;
        }
        if (o1%2 == 0 && o2%2 != 0)
        {
            return 1;
        }
        return -1;
    }
}

