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

public class Student extends Person
{
    private double GPA;

    public Student(double GPA, String name, int legs)
    {
        super(name, legs);
        this.GPA = GPA;
    }
   
    public boolean equals(Object other)
    {
        if (!super.equals(other))
        {
            return false;
        }
        else
        {
            return GPA == ((Student)other).GPA;
        }
    }
 
    public String toString()
    {
        return super.toString() + " and a Student object with a " + GPA + " gpa";
    }
}

