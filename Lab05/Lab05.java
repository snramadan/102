/**
 * DES
 *
 * @author Saba Ramadan
 * @version Lab05
 * @version CPE102-05
 * @version Fall 2016
 */

import java.util.Scanner;
import java.util.*;

public class Lab05
{
    public static void main(String[] args)
    {
        //sets up ArrayLists for each array type
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Double> doubList = new ArrayList<Double>();
        ArrayList<String> strList = new ArrayList<String>();
        int index = 0;
     
        //calls scanner
        Scanner scanner = new Scanner(System.in);

        //while loop to determine what values are entered and for putting them in the correct list
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

        //prints out the integers in array list for integers
        System.out.print("Integers: " + "\n");
        for (int x : intList)
        {
            System.out.println("   Integer[" + index + "] is " + x);
            index++;
        }

        //prints out the doubles in array list for doubles
        System.out.print("Doubles: " + "\n");
        int ind = 0;
        for (double y : doubList)
        {
            System.out.println("   Double[" + ind + "] is " + y);
            ind++;
        }

        //prints out the other in array list for other
        System.out.print("Other: " + "\n");
        int inde = 0;
        for (String z : strList)
        {
            System.out.println("   Other[" + inde + "] is " + z);
            inde++;
        }
    }
}


