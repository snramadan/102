/**
 * Circle Class
 *
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-09
 * @version Spring 2016
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

    public Circle(double radius, Point position, Color color, boolean filled)
    {
        this.radius = radius;
        this.position = position;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius; 
    }
   
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Point getPosition()
    {
        return position;
    }
    
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
  
    public double getArea()
    {
        double area = ((Math.PI)*(Math.pow(radius, 2)));
        return area;
    }

    public Color getColor()
    {
        return color;
    }
   
    public void setColor(Color color)
    {
        this.color = color;
    }
   
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

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
  
    public void move(Point point)
    {
        this.position.x = (position.x + point.x);
        this.position.y = (position.y + point.y);
    }       

}
