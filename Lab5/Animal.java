/**
 * A starter JUnit test class to test the Lab 05 - Animal, Person and Student classes.
 *
 * @author Saba Ramadan
 * @version Lab 05
 * @version CPE102-09
 * @version Spring 2016
 */

import java.awt.*;
import java.util.*;

public class Animal
{
    private int legs;

    public Animal(int legs)
    {
        this.legs = legs;
    }
  
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
  
    public String toString()
    {
        return "I am an Animal object with " + legs + " legs";
    }

}


