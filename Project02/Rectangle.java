/**
 * DES
 *
 * @author Saba Ramadan
 * @version Project 02
 * @version CPE102-09
 * @version Spring 2016
 */

import java.awt.*;
import java.util.*;
import java.lang.*;

public class Rectangle implements Shape
{
    private double width;
    private double height;
    private Point position;
    private Color color;
    private boolean filled;

    public Rectangle(double width, double height, Point position, Color color, boolean filled)
    {
        this.width = width;
        this.height = height;
        this.position = position;
        this.color = color;
        this.filled = filled;
    }
   
    public double getWidth()
    {
        return width;
    }
  
    public void setWidth(double width)
    {
        this.width = width;
    }
 
    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
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
            Rectangle r = (Rectangle)other;
            return width == r.width && height == r.height && position.equals(r.position) && color.equals(r.color);
        }
    }

     public Color getColor()
    {
        return color;
    }

    public double getArea()
    {
        double area = (height * width);
        return area;
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
