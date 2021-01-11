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

public class Person extends Animal
{
    private String name;

    public Person(String name, int legs)
    {
        super(legs);
        this.name = name;
    }

    public boolean equals(Object other)
    {
        if (!super.equals(other))
        {
            return false;
        }
        else
        {
            return name.equals(((Person)other).name);
        }
    }
    
    public String toString()
    {
        return super.toString() + " and a Person whose name is " + name;
    }
}

