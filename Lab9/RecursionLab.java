/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 09
 * @version CPE102-09
 * @version Spring 2016
 */

import java.lang.Object;
import java.lang.String;

public class RecursionLab
{
    public static int findMax(int[] items, int index)
    {
        if (index < items.length)
        {
            return Math.max(items[index], findMax(items, index+1));
        }
        else
        {
            return 0;
        }
    }
    
    public static int countSpaces(String sentence)
    {
        if (sentence.length()== 0)
        {
           return 0;           
        }
        char c = sentence.charAt(0);
        if (c != ' ') 
        {
           return countSpaces(sentence.substring(1));
        }
        else
        {
           return countSpaces(sentence.substring(1)) + 1;   
        }    
    }

    public static boolean isPalindrome(String sentence)
    {
        if (sentence.length() == 0 || sentence.length() == 1)
        {
            return true;
        }
        String s = sentence.toLowerCase();
        if (s.charAt(0) == s.charAt(s.length() - 1))
        {
             return isPalindrome(s.substring(1, s.length() - 1));
        }
        else
        {
             return false;
        }    
    } 

}

