/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 08
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.*;

public class OddEvenAscending implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2)
    {
        if (o1%2 == 0 && o2%2 == 0)
        {
            if (o1 > o2)
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
            if (o1 > o2)
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
