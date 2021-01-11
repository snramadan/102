/**
 * Student Class
 * 
 * @author Saba Ramadan
 * @version Lab06
 * @version CPE102-05
 * @version Fall 2016
 */

import java.awt.*;
import java.util.*;

public class Student extends Person
{
    //instance variable for GPA
    private double GPA;

    //initializes GPA, name, legs constructor
    public Student(double GPA, String name, int legs)
    {
        super(name, legs);
        this.GPA = GPA;
    }

    //compares variables using Animal and Person 
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

    //prints pervious classes outputs and adds GPA
    public String toString()
    {
        return super.toString() + " and a Student object with a " + GPA + " gpa";
    }
}
