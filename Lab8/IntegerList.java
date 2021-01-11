/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 08
 * @version CPE102-09
 * @version Spring 2016
 */

import java.lang.Object;
import java.util.Collections;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class IntegerList
{
    private ArrayList<Integer> integers;

    public IntegerList(int num, int max)
    {
        integers = new ArrayList<Integer>(num);
        Random rand = new Random();
        for (int i = 0; i < num; i++)
        {
            integers.add(rand.nextInt(max));
        }   
    }

    public IntegerList(int num, int max, int seed)
    {
        integers = new ArrayList<Integer>(num);
        Random rand = new Random();
        rand.setSeed(seed);
        for (int i = 0; i < num; i++)
        {
            integers.add(rand.nextInt(max));
        } 
    }

    public void sort()
    {
        Collections.sort(integers); 
    }

    public void sort(Comparator<Integer> other)
    {
        Collections.sort(integers, other);   
    }

    public boolean isSorted()
    {
        boolean isSorted = true;
        for (int i = 0; i < integers.size() - 1; i++)
        {
             int y = (integers.get(i)).compareTo(integers.get(i+1));
             if (y >= 0)
                 isSorted = false;
        }
        return isSorted;
    }

    public boolean isSorted(Comparator<Integer> other)
    {
        boolean isSorted = true;
        for (int i = 0; i < integers.size() - 1; i++)
        {
            int y = other.compare(integers.get(i), integers.get(i+1));
            if (y != 0)
                isSorted = false;
        }
        return isSorted;
    }

    public String toString()
    {
        String s = "";
        for (int i = 0; i < integers.size(); i++)
        {
             s += (integers.get(i)).toString() + "\n";
        }
        return s; 
    }

    public Integer get(int index)
    {
        return integers.get(index);
    }
        
   public void mySLOsort()
   {
       // Insertion
       for (int i = 1; i < integers.size() - 1; i++)
       {
            for (int j = i; j > 0; j--)
            {
                 if (integers.get(j) < integers.get(j-1))
                 {
                     int t = integers.get(j);
	  	     integers.set(j, integers.get(j-1));
                     integers.set(j-1, t);
                 }
            }
       	}
   }

   public void mySLOsort(Comparator<Integer> other)
   {
       // Insertion
       for (int i = 1; i < integers.size() - 1; i++)
       {
            for (int j = i; j > 0; j--)
            { 
                if (other.compare(integers.get(j), integers.get(j-1)) < 0)
                {
                    int t = integers.get(j);
                    integers.set(j, integers.get(j-1));
                    integers.set(j-1, t);
                }
            }
       }
   } 

   /*public int binarySearch(int key)
   {
       int min = 0;
       
       while (min <= max)
       {
            int iMid = (min + max)/2;
            if ((integers.get(iMid)).compareTo(key) == 0)
               return iMid;
            if ((integers.get(iMid)).compareTo(key) < 0)
               min = iMid + 1;
            else
               max = iMid - 1;
       }
       return -1;
   }*/		
}
