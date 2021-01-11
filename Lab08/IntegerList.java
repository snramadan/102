/*
 * Lab 8
 * 
 * @author Saba Ramadan
 * @version Lab 08
 * @version CPE102-05
 * @version Fall 2016
 */

import java.lang.Object;
import java.util.Collections;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class IntegerList
{
    //instance variable
    private ArrayList<Integer> integers;

    //constuctor that sets the number of things in the array and sets the number less than that specified max value
    public IntegerList(int num, int max)
    {
        integers = new ArrayList<Integer>(num);
        Random rand = new Random();
        for (int i = 0; i < num; i++)
        {
            integers.add(rand.nextInt(max));
        }
    }

    //constuctor that sets the number of things in the array and sets the number less than that specified max value using a seed
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
    
    //sorts the integers in the array 
    public void sort()
    {
        Collections.sort(integers);
    }

    //sorts integers using a specific comparator 
    public void sort(Comparator<Integer> other)
    {
        Collections.sort(integers, other);
    }

    //checks if sorted naturally 
    public boolean isSorted()
    {
        for (int i = 0; i < integers.size() - 1; i++)
        {
             int y = integers.get(i).compareTo(integers.get(i+1));
             if (y > 0)
                 return false;
        }
        return true;
    }

    //checks if sorted like a specific comparator 
    public boolean isSorted(Comparator<Integer> other)
    {
        for (int i = 0; i < integers.size() - 1; i++)
        {
            if (other.compare(integers.get(i), integers.get(i+1)) > 0)
            {
                return false;
            }
        }
        return true;
    }

    //string output of integers in the array
    public String toString()
    {
        String s = "";
        for (int i = 0; i < integers.size(); i++)
        {
             s += (integers.get(i)).toString() + "\n";
        }
        return s;
    }

    //gets integer at specific index
    public Integer get(int index)
    {
        return integers.get(index);
    }

    //sorts array using insertion sort
    public void mySLOsort()
    {
       //insertion
       for (int i = 1; i < integers.size(); i++)
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

    //sorts array using insertion sort and a specified comparator 
    public void mySLOsort(Comparator<Integer> other)
    {
       //insertion
       for (int i = 1; i < integers.size(); i++)
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

    //returns the index where key is found 
    public int binarySearch(int key)
    {
       int min = 0;
       int max = integers.size() - 1;
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
    }
}
