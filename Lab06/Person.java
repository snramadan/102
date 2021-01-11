/**
 * Person Class
 *   
 * @author Saba Ramadan
 * @version Lab06
 * @version CPE102-05
 * @version Fall 2016
 */

import java.awt.*;
import java.util.*;

public class Person extends Animal
{
    //sets up instance varible for name
    private String name;

    //constructor that initializes name and legs
    public Person(String name, int legs)
    {
        super(legs);
        this.name = name;
    }

    //compares object to person and uses Animals extension
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

    //prints output of Animal method and adds name
    public String toString()
    {
        return super.toString() + " and a Person object whose name is " + name;
    }
}

