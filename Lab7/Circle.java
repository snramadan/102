/*
 * DES
 *
 * @author Saba Ramadan
 * @version Lab 07
 * @version CPE102-09
 * @version Spring 2016
 */

import java.util.Random;

public class Circle
{
    public static final double PI = 3.14159;
    private double radius;

    public Circle()
    {
        Random rand = new Random();
        radius = rand.nextDouble()*10;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        if (radius == 0)
        {
            throw new ZeroRadiusException();
        }
        if (radius < 0)
        {
            throw new NegativeRadiusException(radius);
        }
    }

    public double radius()
    {
        return radius;
    }
    
    public double diameter()
    {
        return radius*2;
    }
    
    public double circumference()
    {
        return 2*PI*radius;
    }
    
    public double area()
    {
        return PI*radius*radius;
    }
    
    public String toString()
    {
        return "Radius: " + radius;
    }
}
