/**
 * Circle Class
 *  
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-05
 * @version Fall 2016
 */

import java.awt.*;
import java.util.ArrayList;
import org.junit.*;
import java.util.*;
import java.lang.*;


public class Circle implements Shape
{
    private double radius;
    private Point position;
    private Color color;
    private boolean filled;

    //sets dimension of circle
    public Circle(double radius, Point position, Color color, boolean filled)
    {
        this.radius = radius;
        this.position = position;
        this.color = color;
        this.filled = filled;
    }

    //inquery for radius
    public double getRadius()
    {
        return radius;
    }

    //set radius
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    //inquery for position
    public Point getPosition()
    {
        return position;
    }

    //checks if the object inputed is the same as the circle
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        else if (this.getClass() != other.getClass())
        {
            return false;
        }
        else
        {
            Circle c = (Circle)other;
            return radius == c.radius && position.equals(c.position) && color.equals(c.color);
        }
    }

    //inquery for area
    public double getArea()
    {
        double area = ((Math.PI)*(Math.pow(radius, 2)));
        return area;
    }

    //inquery for color
    public Color getColor()
    {
        return color;
    }

    //sets color
    public void setColor(Color color)
    {
        this.color = color;
    }

    //inquery for if the the circle is filled or not
    public boolean getFilled()
    {
        if (filled == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //sets circle to filled
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    //moves origin point by the numbers in the new point
    public void move(Point point)
    {
        this.position.x = (position.x + point.x);
        this.position.y = (position.y + point.y);
    }

}

