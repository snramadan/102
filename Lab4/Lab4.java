/**
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 04
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.Scanner;
import java.util.*;

public class Lab4
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Double> doubList = new ArrayList<Double>();
        ArrayList<String> strList = new ArrayList<String>();
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while(!done)
        {
            System.out.print("Enter an int, double, any random text, or type 'quit' to end: ");
            
            if (scanner.hasNextInt())
            {
                int i = scanner.nextInt();
                scanner.nextLine();
                intList.add(new Integer(i));
            }
            else if (scanner.hasNextDouble())
            {
                double d = scanner.nextDouble();
                scanner.nextLine();
                doubList.add(new Double(d));
            }
            else
            { 
                String s = scanner.nextLine();
                if (s.equals("quit"))
                {
                    done = true;
                }
                strList.add(new String(s));
                strList.remove("quit");
            }
        }
        System.out.print("Integers: " + "\n");
        for (int x : intList)
        {
            System.out.println("   Integer[" + index + "] is " + x);
            index++;
        }

        System.out.print("Doubles: " + "\n");
        int ind = 0;
        for (double y : doubList)
        {
            System.out.println("   Double[" + ind + "] is " + y);
            ind++;
        }
      
        System.out.print("Other: " + "\n");
        int inde = 0;
        for (String z : strList)
        {
            System.out.println("   Other[" + inde + "] is " + z);
            inde++;
        }
    }
}

