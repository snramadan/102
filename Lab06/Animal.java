/**
 * Animal Class
 *
 * @author Saba Ramadan
 * @version Lab06
 * @version CPE102-05
 * @version Fall 2016
 */

import java.awt.*;
import java.util.*;

public class Animal
{
    //creates instance variable for number of legs
    private int legs;

    //constructor that initializes the legs
    public Animal(int legs)
    {
        this.legs = legs;
    }

    //compares variables with other object
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        if (getClass() != other.getClass())
        {
            return false;
        }
        else
        {
            return legs == ((Animal)other).legs;
        }
    }

    //string method that prints out number of legs
    public String toString()
    {
        return "I am an Animal object with " + legs + " legs";
    }

}


